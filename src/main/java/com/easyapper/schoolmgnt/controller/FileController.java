package com.easyapper.schoolmgnt.controller;

import com.easyapper.schoolmgnt.response.*;
import com.easyapper.schoolmgnt.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping("/uploadFile")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("userId") String userId,
                                         @RequestParam("userName") String userName) {

        String fileName = fileStorageService.storeFile(file,userName,Long.valueOf(userId));
        return new UploadFileResponse(fileName, file.getContentType(), file.getSize());
    }

    @PostMapping("/uploadMultipleFiles")
    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files, @RequestParam("userId") String userId,
                                                        @RequestParam("userName") String userName) {
        return Arrays.asList(files)
                .stream()
                .map(file -> {
                    String fileName =fileStorageService.storeFile(file, userName, Long.valueOf(userId));
                    return new UploadFileResponse(fileName, file.getContentType(), file.getSize());
                })
                .collect(Collectors.toList());
    }
}