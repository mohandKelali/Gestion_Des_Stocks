package com.smk.app.entite;

import java.io.Serializable;

import javax.persistence.*;

/****************************************La table LigneVente****************************************/
@Entity
public class LigneVente implements Serializable{
	
	/****************************************Les attributs****************************************/
	
	@Id
	@GeneratedValue
	private Long idLigneVente;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idVente")
	private Vente vente;

	/****************************************Les constructeurs****************************************/
	
	public LigneVente() {
	
	}
	 
	/****************************************Les getters et setters****************************************/
	
	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
	
	

}
