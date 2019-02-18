package com.smk.app.controleur.commande;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommandeFControleur {

	@RequestMapping(value = "/commande/fournisseur",method=RequestMethod.GET)
	
	public String home() {
		
		return "commande/commandeFournisseur";
	}
}
