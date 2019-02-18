package com.smk.app.controleur.ligneCommande;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class LigneCControleur {

	@RequestMapping(value = "/ligne/commande/client",method=RequestMethod.GET)
	
	public String home() {
		
		return "ligneCommande/ligneClient";
	}
}
