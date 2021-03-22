package com.easyapper.schoolmgnt.repository;

import com.easyapper.schoolmgnt.model.*;
import org.springframework.data.repository.*;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Repository;

@Repository
public interface FileUploadRepository extends CrudRepository<FileUploadDetail, Long> {

    Iterable<FileUploadDetail> findAllByIsCompleted(boolean flag);
}