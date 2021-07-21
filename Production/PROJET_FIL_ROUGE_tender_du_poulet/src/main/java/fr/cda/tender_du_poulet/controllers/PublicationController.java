package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.service.PublicationService;

@RestController
public class PublicationController {

	@Autowired
	private PublicationService service;
	
	@GetMapping(value = "/recupPublications")
	public List<PublicationDTO> recupAllPublication() {
		return service.recupAllPublication();
	}
	
	@PostMapping(value = "/recupPublication")
	public PublicationDTO recupPublication(@RequestBody String id) {
		return service.recupPublication(Integer.parseInt(id));
	}
	
	@PostMapping(value = "/ajoutPublication")
	public void AjoutPublication(@RequestBody PublicationDTO p) {
		service.ajoutPublication(p);
	}
	
	@PostMapping(value = "/supprimerPublication")
	public void supprimerPublication(@RequestBody String id) {
		service.supprimerPublication(Integer.parseInt(id));
	}
	
}
