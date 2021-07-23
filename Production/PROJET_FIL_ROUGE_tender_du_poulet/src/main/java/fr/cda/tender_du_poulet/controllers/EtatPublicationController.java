package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.EtatPublicationDTO;
import fr.cda.tender_du_poulet.service.EtatPublicationService;

@RestController
public class EtatPublicationController {

	@Autowired
	private EtatPublicationService service;
	
	@PostMapping(value = "/recupEtatPublication") 
	public EtatPublicationDTO recupEtatPublication(@RequestBody String id) {
		return service.recupEtatPublication(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/recupAllEtatPublication")
	public List<EtatPublicationDTO> recupAllEtatPublication() {
		return service.recupAllEtatPublication();
	}
	
	@PostMapping(value = "/ajoutEtatPublication")
	public void ajouterEtatPublication(@RequestBody EtatPublicationDTO e) {
		service.ajoutEtatPublication(e);
	}
	
	@PostMapping(value = "/supprimerEtatPublication")
	public void supprimerEtatPublication(@RequestBody String id) {
		service.supprimerEtatPublication(Integer.parseInt(id));
	}
	
	@PostMapping(value = "/modifEtatPublication")
	public void modifEtatPublication(@RequestBody EtatPublicationDTO e) {
		service.modifEtatPublication(e);
	}
	
}
