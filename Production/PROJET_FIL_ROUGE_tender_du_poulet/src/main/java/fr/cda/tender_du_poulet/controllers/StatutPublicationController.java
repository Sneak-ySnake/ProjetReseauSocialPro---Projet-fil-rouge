package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.StatutPublicationDTO;
import fr.cda.tender_du_poulet.service.StatutPublicationService;

@RestController
public class StatutPublicationController {

	private StatutPublicationService service = new StatutPublicationService();
	
	@GetMapping(value = "/recupStatutPublication")
	public StatutPublicationDTO recupStatutPublication(int id) {
		return service.recupStatutPublication(id);
	}
	
	@GetMapping(value = "/recupStatutPublications")
	public List<StatutPublicationDTO> recupAllStatutPublication() {
		return service.recupAllStatutPublication();
	}
	
	@PostMapping(value = "/ajoutStatutPublication")
	public void ajoutStatutPublication(StatutPublicationDTO s) {
		service.ajoutStatutPublication(s);
	}
	
}
