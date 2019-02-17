package com.smk.app.entite;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/****************************************La table Mouvement de stocks****************************************/
@Entity
public class MvtStock implements Serializable {

	/****************************************Les attributs****************************************/
	public static final  int ENTREE=1;
	
	public static final  int SORTIE=2;
	
	@Id
	@GeneratedValue
	private Long idMvtStock;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date  dateMvtStock;
	
	private BigDecimal quantite;
	
	private int typeMvtStock;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	/****************************************Les constructeurs****************************************/
	
	public MvtStock() {
	
	}

	/****************************************Les getters et setters****************************************/
	
	public Long getIdMvtStock() {
		return idMvtStock;
	}

	public void setIdMvtStock(Long idMvtStock) {
		this.idMvtStock = idMvtStock;
	}

	public Date getDateMvtStock() {
		return dateMvtStock;
	}

	public void setDateMvtStock(Date dateMvtStock) {
		this.dateMvtStock = dateMvtStock;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMvtStock() {
		return typeMvtStock;
	}

	public void setTypeMvtStock(int typeMvtStock) {
		this.typeMvtStock = typeMvtStock;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
