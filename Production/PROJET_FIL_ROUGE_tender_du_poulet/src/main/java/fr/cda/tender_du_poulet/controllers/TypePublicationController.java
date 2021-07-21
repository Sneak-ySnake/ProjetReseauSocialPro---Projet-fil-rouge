package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.TypePublicationDTO;
import fr.cda.tender_du_poulet.service.TypePublicationService;

@RestController
public class TypePublicationController {

	@Autowired
	private TypePublicationService service;
	
	@GetMapping(value = "/recupTypePublication")
	public TypePublicationDTO recupTypePublication(int id) {
		return service.recupTypePublication(id);
	}
	
	@GetMapping(value = "/recupTypePublications")
	public List<TypePublicationDTO> recupAllTypePublication() {
		return service.recupAllTypePublication();
	}
	
	@PostMapping("/ajoutTypePublication")
	public void ajoutTypePublication(@RequestBody TypePublicationDTO t) {
		service.ajoutTypePublication(t);		
	}
	
}
