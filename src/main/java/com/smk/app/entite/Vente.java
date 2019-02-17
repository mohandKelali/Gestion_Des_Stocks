package com.smk.app.entite;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

	/****************************************La table Vente****************************************/

@Entity
public class Vente implements Serializable {
	
	/****************************************Les attributs****************************************/
	@Id
	@GeneratedValue
	private Long idVente;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente;
	
	@OneToMany(mappedBy="vente")
	private List<LigneVente> lignesVente;

	/****************************************Les constructeurs****************************************/
	
	public Vente() {
	
	}

	/****************************************Les getters et setters****************************************/
	
	public Long getIdVente() {
		return idVente;
	}

	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public List<LigneVente> getLignesVente() {
		return lignesVente;
	}

	public void setLignesVente(List<LigneVente> lignesVente) {
		this.lignesVente = lignesVente;
	}
	
	
	
	
	
	
	
	
}
