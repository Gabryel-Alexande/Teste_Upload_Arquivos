package com.upload.Upload.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upload.Upload.model.Post;
import com.upload.Upload.services.PostSevice;

@Service
public class FacadePost {

	@Autowired
	private PostSevice postSevice;
	
	public void salvarPost(Post post) {
		
		postSevice.salvarPost(post);
		
	}
	
	public Post recuperarPostVazio() {
		
		
		return new Post("", null);
	}
}
