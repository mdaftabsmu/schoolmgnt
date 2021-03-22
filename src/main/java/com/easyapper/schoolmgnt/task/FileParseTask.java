package com.easyapper.schoolmgnt.task;

import com.easyapper.schoolmgnt.service.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.scheduling.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Component
@Slf4j
public class FileParseTask {

    @Autowired
    private FileStorageService fileStorageService;

    @Scheduled(fixedRate = 1000)
    public void create() {
        long start = System.currentTimeMillis();
        log.info("Job started "+new Date());
        fileStorageService.fileUpdate();
        long end = System.currentTimeMillis();
        log.info("Total time of execution : "+(end-start));
    }
}
