package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.TypePublication;
import fr.cda.tender_du_poulet.dto.TypePublicationDTO;
import fr.cda.tender_du_poulet.service.TypePublicationService;

@RestController
public class TypePublicationController {

	@Autowired
	private TypePublicationService service;
	
	@PostMapping(value = "/recupTypePublication")
	public TypePublicationDTO recupTypePublication(@RequestBody TypePublication t) {
		return service.recupTypePublication(t.getId_type_publication());
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
	public void supprimerTypePublication(@RequestBody TypePublication t) {
		service.supprimerTypePublication(t.getId_type_publication());
	}
	
	@PostMapping("/modifTypePublication")
	public void modifTypePublication(@RequestBody TypePublication t) {
		service.modifTypePublication(t.getId_type_publication(),t.getNom_type_publication());
	}
	
}
