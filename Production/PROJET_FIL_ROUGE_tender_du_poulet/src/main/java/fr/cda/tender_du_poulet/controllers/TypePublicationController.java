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
	
	@PostMapping(value = "/recupTypePublication")
	public TypePublicationDTO recupTypePublication(@RequestBody String id) {
		return service.recupTypePublication(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/recupTypePublications")
	public List<TypePublicationDTO> recupAllTypePublication() {
		return service.recupAllTypePublication();
	}
	
	@PostMapping("/ajoutTypePublication")
	public void ajoutTypePublication(@RequestBody TypePublicationDTO t) {
		service.ajoutTypePublication(t);		
	}
	
	@PostMapping("/supprimerTypePublication")
	public void supprimerTypePublication(@RequestBody String id) {
		service.supprimerTypePublication(Integer.parseInt(id));
	}
	
	@PostMapping("/modifTypePublication")
	public void modifTypePublication(@RequestBody TypePublicationDTO t) {
		service.modifTypePublication(t);
	}
	
}
