package fr.cda.tender_du_poulet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dao.PublicationRepository;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.service.PublicationService;

@RestController
public class PublicationController {

	private PublicationService service = new PublicationService();
	
	@Autowired 
	PublicationRepository publicationRepository;
	
	@GetMapping(value = "/ajoutPublication")
	public void AjoutPublication(PublicationDTO p) {
		service.ajoutPublication(p);
	}
	
}
