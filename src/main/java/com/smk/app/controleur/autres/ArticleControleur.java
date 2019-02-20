package com.smk.app.controleur.autres;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smk.app.entite.Article;


@Controller
public class ArticleControleur {

	
	@RequestMapping(value = "/article",method=RequestMethod.GET)
	
	public String home(Model model) {
		
	
		return "autres/article";
	}
}
