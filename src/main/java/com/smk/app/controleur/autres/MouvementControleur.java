package com.smk.app.controleur.autres;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MouvementControleur {

	@RequestMapping(value = "/mouvement/stock",method=RequestMethod.GET)
	
	public String home() {
		
		return "autres/mouvementStock";
	}
}
