package com.smk.app.controleur.ligneCommande;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LigneFControleur {

	@RequestMapping(value = "/ligne/commande/fournisseur",method=RequestMethod.GET)
	
	public String home() {
		
		return "ligneCommande/ligneFournisseur";
	}
}
