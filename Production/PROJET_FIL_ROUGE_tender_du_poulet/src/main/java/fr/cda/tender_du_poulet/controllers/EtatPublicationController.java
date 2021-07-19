package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.EtatPublicationDTO;
import fr.cda.tender_du_poulet.service.EtatPublicationService;

@Controller
public class EtatPublicationController {

	private EtatPublicationService service = new EtatPublicationService();
	
	@GetMapping(value = "/recupEtatPublication") 
	public EtatPublicationDTO recupEtatPublication(int id) {
		return service.recupEtatPublication(id);
	}
	
	@GetMapping(value = "/recupEtatPublications")
	public List<EtatPublicationDTO> recupAllEtatPublication() {
		return service.recupAllEtatPublication();
	}
	
	@GetMapping(value = "/ajouterEtatPublication")
	public String ajouterEtatPublication(EtatPublicationDTO e) {
		service.ajoutEtatPublication(e);
		return "home";
	}
	
}
