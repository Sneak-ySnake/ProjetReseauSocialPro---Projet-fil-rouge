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
	
	@PostMapping(value = "/findEtatPublication") 
	public EtatPublicationDTO findEtatPublication(@RequestBody String id) {
		return service.findEtatPublication(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/findAllEtatPublication")
	public List<EtatPublicationDTO> findAllEtatPublication() {
		return service.findAllEtatPublication();
	}
	
	@PostMapping(value = "/addEtatPublication")
	public void addEtatPublication(@RequestBody EtatPublicationDTO e) {
		service.addEtatPublication(e);
	}
	
	@PostMapping(value = "/deleteEtatPublication")
	public void deleteEtatPublication(@RequestBody String id) {
		service.deleteEtatPublication(Integer.parseInt(id));
	}
	
	@PostMapping(value = "/updateEtatPublication")
	public void updateEtatPublication(@RequestBody EtatPublicationDTO e) {
		service.updateEtatPublication(e);
	}
	
}
