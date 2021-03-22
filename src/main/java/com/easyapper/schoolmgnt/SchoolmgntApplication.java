package com.easyapper.schoolmgnt;

import lombok.extern.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.*;

@SpringBootApplication
@EnableScheduling
public class SchoolmgntApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolmgntApplication.class, args);
	}





}
