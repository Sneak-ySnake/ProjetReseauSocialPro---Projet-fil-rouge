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
	
	@GetMapping(value = "/findAllPublication")
	public List<PublicationDTO> findAllPublication() {
		return service.findAllPublication();
	}
	
	@PostMapping(value = "/findPublication")
	public PublicationDTO findPublication(@RequestBody String id) {
		return service.findPublication(Integer.parseInt(id));
	}
	
	@PostMapping(value = "/addPublication")
	public void addPublication(@RequestBody PublicationDTO p) {
		service.addPublication(p);
	}
	
	@PostMapping(value = "/deletePublication")
	public void deletePublication(@RequestBody String id) {
		service.deletePublication(Integer.parseInt(id));
	}
	
	@PostMapping(value = "/updatePublication")
	public void updatePublication(@RequestBody PublicationDTO p) {
		service.updatePublication(p);
	}
	
	@PostMapping(value = "/findAllDemandeUtilisateur")
	public List<PublicationDTO> recupAllPublicationUtilisateur(@RequestBody UtilisateurDTO u) {
		return service.recupAllDemandeUtilisateur(u);
	}
	
}
