package fr.cda.tender_du_poulet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.cda.tender_du_poulet.dto.DomaineDTO;
import fr.cda.tender_du_poulet.iService.DomaineInterfaceService;

public class DomaineController {
	
	@Autowired
	private DomaineInterfaceService domaineInterfaceService;
	
	@PostMapping(value = "/addDomaine")
	public String ajoutDomaine(@RequestBody DomaineDTO d, Model model) {
		domaineInterfaceService.ajoutDomaine(d);
		System.out.println(d.getNom_domaine());
		return "domaineTestAjout";
	}
}
