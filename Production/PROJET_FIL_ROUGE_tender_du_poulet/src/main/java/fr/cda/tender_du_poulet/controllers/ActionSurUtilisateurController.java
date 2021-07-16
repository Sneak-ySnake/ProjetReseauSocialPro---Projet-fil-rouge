package fr.cda.tender_du_poulet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fr.cda.tender_du_poulet.beans.ActionSurUtilisateur;
import fr.cda.tender_du_poulet.dao.ActionSurUtilisateurRepository;

@Controller
public class ActionSurUtilisateurController {
	
	@Autowired 
	private ActionSurUtilisateurRepository actionSurUtilisateurRepo;
	
	@GetMapping (value = "/creerActionSurUtilisateur")
	public String ajouterActionSurUtilisateur() {
		
		String action ="bannir";
		ActionSurUtilisateur act = new ActionSurUtilisateur(action);
		actionSurUtilisateurRepo.save(act);
		System.out.println(act);
		return "home";
	}
}
