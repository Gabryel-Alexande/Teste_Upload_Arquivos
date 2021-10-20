package com.upload.Upload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.upload.Upload.facade.FacadePost;
import com.upload.Upload.model.Post;

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@Autowired
	private FacadePost facadePost;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("post", facadePost.recuperarPostVazio());
		return "Tela_Inicial";
	}
	
	@PostMapping("/enviar")
	public String uploadPage(@ModelAttribute Post post, Model model) {
				
		facadePost.salvarPost(post);
		
		model.addAttribute("file", post.getArquivo());
		
		return "Upload_Page";
		
		
	}

}