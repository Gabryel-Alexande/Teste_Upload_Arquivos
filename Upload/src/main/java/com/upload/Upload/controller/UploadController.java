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

	private final String telaInicial = "Tela_Inicial";

	/**
	 * Este método retorna a tela inicial que é a tela base do programa
	 * 
	 * @author Gabryel
	 */

	@GetMapping("/")
	public String listarArquivos() {
		return this.telaInicial;
	}

}