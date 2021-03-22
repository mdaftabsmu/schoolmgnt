package com.easyapper.schoolmgnt.model;


import javax.persistence.*;

@Entity
@Table(name = "file_upload_detail")
public class FileUploadDetail {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name ="file_name")
    private String fileName;
    @Column(name ="file_path")
    private String filePath;
    @Column(name ="is_completed")
    private boolean isCompleted;
    @Column(name ="user_name")
    private String userName;
    @Column(name ="user_id")
    private Long  userId;
    @Column(name ="created_date")
    private Long createdDate;

    public FileUploadDetail() {
    }

    public FileUploadDetail(Long id, String fileName, String filePath, boolean isCompleted, String userName, Long userId) {
        this.id = id;
        this.fileName = fileName;
        this.filePath = filePath;
        this.isCompleted = isCompleted;
        this.userName = userName;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "FileUploadDetail{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", isCompleted=" + isCompleted +
                ", userName='" + userName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
