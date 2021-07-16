package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.service.PublicationService;

@RestController
public class PublicationController {

	private PublicationService service = new PublicationService();
	
	@GetMapping(value = "/recupPublications")
	public List<PublicationDTO> recupAllPublication() {
		return service.recupAllPublication();
	}
	
	@GetMapping(value = "/recupPublication")
	public PublicationDTO recupPublication(int id) {
		return service.recupPublication(id);
	}
	
	@PostMapping(value = "/ajoutPublication")
	public void AjoutPublication(PublicationDTO p) {
		service.ajoutPublication(p);
	}
	
}
