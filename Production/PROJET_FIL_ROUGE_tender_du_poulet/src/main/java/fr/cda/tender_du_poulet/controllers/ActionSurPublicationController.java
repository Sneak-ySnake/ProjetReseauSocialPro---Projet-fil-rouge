package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.ActionSurPublication;
import fr.cda.tender_du_poulet.dao.ActionSurPublicationRepository;
import fr.cda.tender_du_poulet.dto.ActionSurPublicationDTO;
import fr.cda.tender_du_poulet.dto.ActionSurUtilisateurDTO;
import fr.cda.tender_du_poulet.service.ActionSurPublicationService;

@RestController
public class ActionSurPublicationController {
	
	@Autowired 
	private ActionSurPublicationService asps;
	
	
	@PostMapping (value = "/creerActionSurPublication")
	public void ajouterActionSurPublication(@RequestBody ActionSurPublicationDTO a) {
		asps.ajoutActionSurPublication(a);
	}
	
	@PostMapping (value ="/recupActionSurPublication")
	public ActionSurPublicationDTO recupActionSurPublication (@RequestBody String id) {
		int idActionSurPublication = Integer.parseInt(id);
		return asps.recupActionSurPublication(idActionSurPublication);
	}
	
	@GetMapping (value = "/recupAllActionSurPublication")
	public List<ActionSurPublicationDTO> recupAllActionSurPublication() {
		return asps.recupAllActionSurPublication();	
	}
	
	@PostMapping (value = "/deleteActionSurPublication")
	public void deleteActionSurPublication(@RequestBody String id) {
		int idActionSurPublication = Integer.parseInt(id);
		asps.deleteActionSurPublication(idActionSurPublication);
	}
	
	@PostMapping (value = "/updateActionSurPublication")
	public void updateActionSurPublication (@RequestBody ActionSurPublicationDTO au) {
		asps.updateActionSurPublication(au);
	}
}
