package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.AccesPublicationId;
import fr.cda.tender_du_poulet.dto.AccesPublicationDTO;
import fr.cda.tender_du_poulet.service.AccesPublicationService;

@RestController
public class AccesPublicationController {

	@Autowired
	AccesPublicationService service;
	
	@GetMapping(value = "/recupAccesPublications")
	public List<AccesPublicationDTO> recupAllAccesPublication() {
		return service.recupAllAccesPublication();
	}
	
	@PostMapping(value = "/recupAccesPublication")
	public AccesPublicationDTO recupAccesPublication(@RequestBody AccesPublicationId id) {
		return service.recupAccesPublication(id);
	}
	
	@PostMapping(value = "/ajoutAccesPublication")
	public void ajoutPublication(@RequestBody AccesPublicationDTO a) {
		service.ajoutAccesPublication(a);
	}
	
	@PostMapping(value = "/supprimerAccesPublication")
	public void supprimerAccesPublication(@RequestBody AccesPublicationDTO a) {
		service.supprimerAccesPublication(a);
	}
	
}
