package com.smk.app.entite;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

	/****************************************La table Client****************************************/
@Entity
public class Client implements Serializable {

	/****************************************Les attributs****************************************/

	@Id
	@GeneratedValue
	private Long idClient;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String photo;
	
	private String mail;

	@OneToMany(mappedBy ="client")
	private List<CommandeClient> commandesClient;
	

	/****************************************Les constructeurs****************************************/
	
	public Client() {
		
	}

	/****************************************Les getters et setters****************************************/
	
	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public List<CommandeClient> getCommandesClient() {
		return commandesClient;
	}

	public void setCommandesClient(List<CommandeClient> commandesClient) {
		this.commandesClient = commandesClient;
	}

	
}
