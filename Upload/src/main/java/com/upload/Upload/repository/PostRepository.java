package com.upload.Upload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.upload.Upload.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	public Post findByNome(String nome);
}
