package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.StatutPublicationDTO;
import fr.cda.tender_du_poulet.service.StatutPublicationService;

@RestController
public class StatutPublicationController {

	@Autowired
	private StatutPublicationService service;
	
	@GetMapping(value = "/findStatutPublication")
	public StatutPublicationDTO findStatutPublication(@RequestBody String id) {
		return service.findStatutPublication(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/findAllStatutPublication")
	public List<StatutPublicationDTO> findAllStatutPublication() {
		return service.findAllStatutPublication();
	}
	
	@PostMapping(value = "/addStatutPublication")
	public void addStatutPublication(@RequestBody StatutPublicationDTO s) {
		service.addStatutPublication(s);
	}
	
	@PostMapping(value = "/deleteStatutPublication")
	public void deleteStatutPublication(@RequestBody String id) {
		service.deleteStatutPublication(Integer.parseInt(id));
	}

	@PostMapping(value = "/updateStatutPublication")
	public void updateStatutPublication(@RequestBody StatutPublicationDTO s) {
		service.updateStatutPublication(s);
	}
	
}
