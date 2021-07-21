package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.StatutPublicationDTO;
import fr.cda.tender_du_poulet.service.StatutPublicationService;

@RestController
public class StatutPublicationController {

	@Autowired
	private StatutPublicationService service;
	
	@GetMapping(value = "/recupStatutPublication")
	public StatutPublicationDTO recupStatutPublication(@RequestBody String id) {
		return service.recupStatutPublication(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/recupStatutPublications")
	public List<StatutPublicationDTO> recupAllStatutPublication() {
		return service.recupAllStatutPublication();
	}
	
	@PostMapping(value = "/ajoutStatutPublication")
	public void ajoutStatutPublication(@RequestBody StatutPublicationDTO s) {
		service.ajoutStatutPublication(s);
	}
	
}
