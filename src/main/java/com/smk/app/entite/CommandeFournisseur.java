package com.smk.app.entite;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/****************************************La table CommandeFournisseur****************************************/
@Entity
public class CommandeFournisseur implements Serializable {
	
	/****************************************Les attributs****************************************/
	
	@Id
	@GeneratedValue
	private Long idCommandeFournisseur;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur;

	@OneToMany(mappedBy="commandeFournisseur")
	private List<LigneCommandeFournisseur> lignesCommandeFournisseur;
	

	/****************************************Les constructeurs****************************************/
	
	public CommandeFournisseur() {
		
	}

	/****************************************Les getters et setters****************************************/

	public List<LigneCommandeFournisseur> getLignesCommandeFournisseur() {
		return lignesCommandeFournisseur;
	}

	public void setLignesCommandeFournisseur(List<LigneCommandeFournisseur> lignesCommandeFournisseur) {
		this.lignesCommandeFournisseur = lignesCommandeFournisseur;
	}
	
	public Long getIdCommandeFournisseur() {
		return idCommandeFournisseur;
	}

	public void setIdCommandeFournisseur(Long idCommandeFournisseur) {
		this.idCommandeFournisseur = idCommandeFournisseur;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	
	

}
