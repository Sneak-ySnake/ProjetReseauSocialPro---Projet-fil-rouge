package fr.cda.tender_du_poulet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fr.cda.tender_du_poulet.beans.ActionSurPublication;
import fr.cda.tender_du_poulet.dao.ActionSurPublicationRepository;

@Controller
public class ActionSurPublicationController {
	
	@Autowired 
	private ActionSurPublicationRepository actionSurPublicationRepo;
	
	
	@GetMapping (value = "/creerActionSurPublication")
	public String ajouterActionSurpublication() {
		
		String action = "effacer";
		ActionSurPublication act = new ActionSurPublication(action);
		actionSurPublicationRepo.save(act);
		return "home";
	}
}
