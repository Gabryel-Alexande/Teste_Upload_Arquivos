package com.upload.Upload.model;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Entity
public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPost;

	@Column(name = "Nome")
	private String nome;

	@Column(name = "Arquivo")
	private File arquivo;

	public Post(String nome, File file) {
		this.nome = nome;
		this.arquivo = file;
	}

}