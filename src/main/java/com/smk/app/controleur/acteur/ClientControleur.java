package com.smk.app.controleur.acteur;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientControleur {

	@RequestMapping(value = "/client",method=RequestMethod.GET)
	
	public String home() {
		
		return "acteur/client";
	}
}
