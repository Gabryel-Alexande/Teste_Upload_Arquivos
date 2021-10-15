package com.upload.Upload.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.upload.Upload.services.PostSevice;


@Controller
public class UploadController {
	@Autowired
	private PostSevice postSevice;
	/*
	 * 
	 */
	@GetMapping("/")
	public String listarArquivos() {
		return "Tela_Inicial";
	}

}