package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.TypePublicationDTO;
import fr.cda.tender_du_poulet.service.TypePublicationService;

@RestController
public class TypePublicationController {

	private TypePublicationService service = new TypePublicationService();
	
	@GetMapping(value = "/recupTypePublication")
	public TypePublicationDTO recupTypePublication(int id) {
		return service.recupTypePublication(id);
	}
	
	@GetMapping(value = "/recupTypePublications")
	public List<TypePublicationDTO> recupAllTypePublication() {
		return service.recupAllTypePublication();
	}
	
	@PostMapping("/ajoutTypePublication")
	public void ajoutTypePublication(TypePublicationDTO t) {
		service.ajoutTypePublication(t);
	}
	
}
