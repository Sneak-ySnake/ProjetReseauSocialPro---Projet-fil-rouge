package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.ActionSurUtilisateur;
import fr.cda.tender_du_poulet.dao.ActionSurUtilisateurRepository;
import fr.cda.tender_du_poulet.dto.ActionSurPublicationDTO;
import fr.cda.tender_du_poulet.dto.ActionSurUtilisateurDTO;
import fr.cda.tender_du_poulet.service.ActionSurUtilisateurService;

@RestController
public class ActionSurUtilisateurController {
	
	@Autowired 
	private ActionSurUtilisateurService asus;
	
	@PostMapping (value = "/addActionSurUtilisateur")
	public void addActionSurUtilisateur(@RequestBody ActionSurUtilisateurDTO a) {
		asus.addActionSurUtilisateur(a);
	}
	
	@PostMapping (value ="/findActionSurUtilisateur")
	public ActionSurUtilisateurDTO findActionSurUtilisateur (@RequestBody String id) {
		int idActionSurUtilisateur = Integer.parseInt(id);
		return asus.findActionSurUtilisateur(idActionSurUtilisateur);
	}
	
	@GetMapping (value = "/findAllActionSurUtilisateur")
	public List<ActionSurUtilisateurDTO> findAllActionSurUtilisateur() {
		return asus.findAllActionSurUtilisateur();	
	}
	
	@PostMapping (value = "/deleteActionSurUtilisateur")
	public void deleteActionSurUtilisateur(@RequestBody String id) {
		int idActionSurUtilisateur = Integer.parseInt(id);
		asus.deleteActionSurUtilisateur(idActionSurUtilisateur);
	}
	
	@PostMapping (value = "/updateActionSurUtilisateur")
	public void updateActionSurUtilisateur (@RequestBody ActionSurUtilisateurDTO au) {
		asus.updateActionSurUtilisateur(au);
	}
	
	
}
