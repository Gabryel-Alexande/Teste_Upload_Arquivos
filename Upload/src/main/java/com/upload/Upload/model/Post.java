package com.upload.Upload.model;

import java.io.File;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	public Post(String nome, File arquivo) {
		this.nome = nome;
		this.arquivo = arquivo;
	}

}