package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.PaysDTO;
import fr.cda.tender_du_poulet.service.PaysService;

@RestController
public class PaysController {

	@Autowired
	private PaysService service;
	
	@PostMapping(value = "/ajoutPays")
	public void ajoutPays(@RequestBody PaysDTO p) {
		service.ajoutPays(p);
	}
	
	@PostMapping(value = "/recupPays")
	public PaysDTO recupPays(@RequestBody String id) {
		return service.recupPays(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/recupAllPays")
	public List<PaysDTO> recupAllPays() {
		return service.recupAllPays();
	}
	
	@PostMapping(value = "/supprimerPays")
	public void supprimerPays(@RequestBody String id) {
		service.supprimerPays(Integer.parseInt(id));
	}
	
}
