package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.AccesPublicationDTO;
import fr.cda.tender_du_poulet.dto.AccesPublicationIdDTO;
import fr.cda.tender_du_poulet.service.AccesPublicationService;

@RestController
public class AccesPublicationController {

	@Autowired
	AccesPublicationService service;
	
	@GetMapping(value = "/findAllAccesPublication")
	public List<AccesPublicationDTO> findAllAccesPublication() {
		return service.findAllAccesPublication();
	}
	
	@PostMapping(value = "/findAccesPublication")
	public AccesPublicationDTO findAccesPublication(@RequestBody AccesPublicationIdDTO id) {
		return service.findAccesPublication(id);
	}
	
	@PostMapping(value = "/addAccesPublication")
	public void addAccesPublication(@RequestBody AccesPublicationDTO a) {
		service.addAccesPublication(a);
	}
	
	@PostMapping(value = "/deleteAccesPublication")
	public void deleteAccesPublication(@RequestBody AccesPublicationIdDTO id) {
		service.deleteAccesPublication(id);
	}
	
	@PostMapping(value = "/modifAccesPublication")
	public void updateAccesPublication(@RequestBody AccesPublicationDTO a) {
		service.updateAccesPublication(a);
	}
	
}
