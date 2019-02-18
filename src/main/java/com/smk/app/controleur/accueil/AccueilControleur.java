package com.smk.app.controleur.accueil;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller

public class AccueilControleur {

	@RequestMapping(value = "/accueil",method=RequestMethod.GET)
	
	public String home() {
		
		return "accueil/accueil";
	}
	
}
