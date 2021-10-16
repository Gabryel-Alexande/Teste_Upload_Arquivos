package com.upload.Upload.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.upload.Upload.services.PostSevice;

@Controller
public class UploadController {
	@Autowired
	private PostSevice postSevice;

	private final String telaInicial = "Tela_Inicial";
	
	public static String uploadDirectory = System.getProperty("user.dir")+"/uploads"; 

	/**
	 * Este método retorna a tela inicial que é a tela base do programa
	 * 
	 * @author Gabryel
	 */

	@GetMapping("/")
	public String listarArquivos(Model model) {
		return this.telaInicial;
	}
	
	@RequestMapping("/upload")
	public String uploadPage(Model model , @RequestParam("files") MultipartFile[] files) {
		
		StringBuilder filesName =  new StringBuilder();
		
		for(MultipartFile file : files ) {
			Path fileNameAndPath = Paths.get(uploadDirectory , file.getOriginalFilename());
			
			filesName.append(file.getOriginalFilename()+" ");
			
			try {
				Files.write(fileNameAndPath,file.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		postSevice.createPostAndADDFiles(files);
		
		model.addAttribute("msg","Sucesso em Upload "+filesName.toString());
		return "Upload_Page";
		
		
	}

}