package com.smk.app.entite;

import java.io.Serializable;

import javax.persistence.*;

	/****************************************La table LigneCommandeFournisseur****************************************/
@Entity
public class LigneCommandeFournisseur implements Serializable {
	
	/****************************************Les attributs****************************************/
	
	@Id
	@GeneratedValue
	private Long idLigneCommandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	/****************************************Les constructeurs****************************************/
	
	public LigneCommandeFournisseur() {
		
	}

	/****************************************Les getters et setters****************************************/
	
	public Long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}

	public void setIdLigneCommandeFournisseur(Long idLigneCommandeFournisseur) {
		this.idLigneCommandeFournisseur = idLigneCommandeFournisseur;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	
	
}
