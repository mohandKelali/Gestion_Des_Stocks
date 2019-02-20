package com.smk.app.controleur.acteur;

import java.util.ArrayList; 
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.smk.app.entite.Article;
import com.smk.app.entite.Client;
import com.smk.app.service.ClientService;


@Controller
public class ClientControleur {
	
	 
	
	@RequestMapping(value = "/client",method=RequestMethod.GET)

	
	
	public String home(Model model) {
		
		ClientService clientService=new ClientService();
		
		Client client=new Client();
		client.setNom("nom");
		client.setPrenom("prenom");
		client.setAdresse("adresse");
		client.setPhoto("fdqdqd");
		client.setMail("mail");
		
		
		client=clientService.save(client);
		
		
		List<Client> clients= clientService.selectAll();
		
		if(clients==null)
		{
			clients=new ArrayList<Client>();
					
		}
		
		
		model.addAttribute("clients",clients);
		
		return "acteur/client";
	}
	
	@RequestMapping(value="/client/ajouter",method=RequestMethod.GET)
	public String ajouter() {
	
		return "acteur/clientAjouter";
		
	}
	
	@Transactional
	@RequestMapping(value="/client/enregistrer",method=RequestMethod.POST)
	public String enregistrer() {
		
		ClientService clientService=new ClientService();
		Client client=new Client();
		client.setNom("nom");
		client.setPrenom("prenom");
		client.setAdresse("adresse");
		client.setPhoto("fdqdqd");
		client.setMail("mail");
		
		
		client=clientService.save(client);
		
		return "redirect:/client";
		
	}
	
}
