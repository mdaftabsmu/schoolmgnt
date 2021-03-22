package com.easyapper.schoolmgnt.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.*;

@ConfigurationProperties(prefix = "file")
@Component
public class FileStorageProperties {
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}