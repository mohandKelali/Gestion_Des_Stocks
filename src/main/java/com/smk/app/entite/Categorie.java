package com.smk.app.entite;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

	/****************************************La table Categorie****************************************/
@Entity
public class Categorie implements Serializable{
	
	/****************************************Les attributs****************************************/
	@Id
	@GeneratedValue
	private Long idCategorie; 
	
	private String code;
	
	private String designation;
	
	@OneToMany(mappedBy="categorie")
	private List<Article> articles;

	public Long getIdCategorie() {
		return idCategorie;
	}

	/****************************************Les constructeurs****************************************/
	
	public Categorie() {
		
	}

	/****************************************Les getters et setters****************************************/
	
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
	
	

}
