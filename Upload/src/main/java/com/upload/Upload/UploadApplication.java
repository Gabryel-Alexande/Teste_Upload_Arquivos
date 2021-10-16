package com.upload.Upload;


import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.upload.Upload.controller.UploadController;


@SpringBootApplication
public class UploadApplication {

	public static void main(String[] args) {
		new File(UploadController.uploadDirectory).mkdir();
		SpringApplication.run(UploadApplication.class, args);
	}


}
