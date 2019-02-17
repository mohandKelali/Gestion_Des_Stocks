package com.smk.app.entite;

import java.io.Serializable;

import javax.persistence.*;

	/****************************************La table Utilisateur****************************************/
@Entity
public class Utilisateur implements Serializable {

	/****************************************Les attributs****************************************/
	
	@Id
	@GeneratedValue
	private Long idUtilisateur;
	
	private String nom;
	
	private String prenom;
	
	private String mail;
	
	private String photo;
	
	private String motDePasse;

	/****************************************Les constructeurs****************************************/
	
	public Utilisateur() {
	
	}

	/****************************************Les getters et setters****************************************/
	
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	
	
	
}
