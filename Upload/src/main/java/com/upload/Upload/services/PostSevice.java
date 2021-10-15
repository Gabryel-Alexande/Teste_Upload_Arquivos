package com.upload.Upload.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upload.Upload.model.Post;
import com.upload.Upload.repository.PostRepository;



@Service
public class PostSevice {

	@Autowired
	private PostRepository postRepository;

	public List<Post> returnPost() {
		return postRepository.findAll();

	}

}
