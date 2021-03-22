package com.easyapper.schoolmgnt.service;

import com.easyapper.schoolmgnt.*;
import com.easyapper.schoolmgnt.exception.*;
import com.easyapper.schoolmgnt.model.*;
import com.easyapper.schoolmgnt.repository.*;
import com.easyapper.schoolmgnt.request.*;
import com.easyapper.schoolmgnt.utils.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

@Service
@Slf4j
public class FileStorageServiceImpl implements FileStorageService {

    private final Path fileStorageLocation;

    @Autowired
    private FileUploadRepository fileUploadRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    public FileStorageServiceImpl(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }

    @Override
    public String storeFile(MultipartFile file,String userName,Long userId) {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        try {
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }
            Path targetLocation = this.fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
            FileUploadDetail detail = new FileUploadDetail();
            detail.setCompleted(false);
            detail.setFileName(fileName);
            log.info(targetLocation.toString());
            detail.setFilePath(targetLocation.toString());
            detail.setUserName(userName);
            detail.setUserId(userId);
            detail.setCreatedDate(new Date().getTime());
            fileUploadRepository.save(detail);
            return fileName;
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    @Override
    public void fileUpdate() {
        Iterable<FileUploadDetail> lists = fileUploadRepository.findAllByIsCompleted(false);
        if(lists==null){
            throw new EasyApperDataException("Data doesn't exist on db");
        }
        log.info("Rows from db :");
        lists.forEach(fileUploadDetail ->{
           Set<Student> std = MultipartFileUploadUtils.parseExcelToObject(fileUploadDetail);
           std.forEach(st->{customerRepository.save(new Customers(st));});
        });
    }


}