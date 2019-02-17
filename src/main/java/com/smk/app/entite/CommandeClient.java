package com.smk.app.entite;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;


	/****************************************La table CommandeClient****************************************/
@Entity
public class CommandeClient implements Serializable {

	/****************************************Les attributs****************************************/
	
	@Id
	@GeneratedValue
	private Long idCommandeClient;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@OneToMany(mappedBy="commandeClient")
	private List<LigneCommandeClient> lignesCommandeClient;
	
	
	/****************************************Les constructeurs****************************************/
	
	public CommandeClient() {
	
	}

	/****************************************Les getters et setters****************************************/
	public Long getIdCommandeClient() {
		return idCommandeClient;
	}

	public void setIdCommandeClient(Long idCommandeClient) {
		this.idCommandeClient = idCommandeClient;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	public List<LigneCommandeClient> getLignesCommandeClient() {
		return lignesCommandeClient;
	}

	public void setLignesCommandeClient(List<LigneCommandeClient> lignesCommandeClient) {
		this.lignesCommandeClient = lignesCommandeClient;
	}
	
	
	
	
}
