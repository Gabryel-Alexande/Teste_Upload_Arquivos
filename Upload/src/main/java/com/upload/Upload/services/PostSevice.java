package com.upload.Upload.services;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.upload.Upload.model.Post;
import com.upload.Upload.repository.PostRepository;

@Service
public class PostSevice {

	@Autowired
	private PostRepository postRepository;

	/**
	 * 
	 * Este método retorna todos os Post armazenados no Banco de Dados
	 * 
	 * @author Gabryel
	 */

	public List<Post> returnPost() {

		return postRepository.findAll();

	}

//	public void createPostAndADDFiles(MultipartFile[] files) {
//		for (MultipartFile file: files) {
//			File arquivo  = new File(file.getOriginalFilename());
//			
//			Post post = new Post(file);
//			postRepository.save(post);
//		}
//		
//		
//	}

}
