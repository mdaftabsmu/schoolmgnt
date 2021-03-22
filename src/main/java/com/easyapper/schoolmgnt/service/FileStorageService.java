package com.easyapper.schoolmgnt.service;

import org.springframework.web.multipart.*;

public interface FileStorageService {
    String storeFile(MultipartFile file,String userName,Long userId);

    public void fileUpdate();
}
