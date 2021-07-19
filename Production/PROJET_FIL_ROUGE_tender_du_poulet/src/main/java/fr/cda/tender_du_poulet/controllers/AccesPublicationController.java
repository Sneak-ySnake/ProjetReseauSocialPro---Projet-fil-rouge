package fr.cda.tender_du_poulet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.AccesPublicationId;
import fr.cda.tender_du_poulet.dto.AccesPublicationDTO;
import fr.cda.tender_du_poulet.service.AccesPublicationService;

@RestController
public class AccesPublicationController {

	AccesPublicationService service = new AccesPublicationService();
	
	@GetMapping(value = "/recupAccesPublication")
	public AccesPublicationDTO recupAccesPublication(AccesPublicationId id) {
		return service.recupAccesPublication(id);
	}
	
	@PostMapping(value = "/ajoutAccesPublication")
	public void ajoutPublication(AccesPublicationDTO a) {
		service.ajoutAccesPublication(a);
	}
	
}
