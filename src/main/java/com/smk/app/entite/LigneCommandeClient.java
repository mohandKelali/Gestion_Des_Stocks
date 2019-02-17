package com.smk.app.entite;

import java.io.Serializable;

import javax.persistence.*;

	/****************************************La table LigneCommandeClient****************************************/
@Entity
public class LigneCommandeClient implements Serializable{

	/****************************************Les attributs****************************************/
	
	@Id
	@GeneratedValue
	private Long idLigneCommandeClient;
	
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private CommandeClient commandeClient;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	/****************************************Les constructeurs****************************************/
	
	public LigneCommandeClient() {

	}

	/****************************************Les getters et setters****************************************/
	
	public Long getIdLigneCommandeClient() {
		return idLigneCommandeClient;
	}

	public void setIdLigneCommandeClient(Long idLigneCommandeClient) {
		this.idLigneCommandeClient = idLigneCommandeClient;
	}

	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
	
	
}
