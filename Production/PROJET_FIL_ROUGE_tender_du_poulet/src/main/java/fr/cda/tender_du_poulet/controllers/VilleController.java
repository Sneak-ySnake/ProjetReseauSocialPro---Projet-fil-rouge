package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.VilleDTO;
import fr.cda.tender_du_poulet.service.VilleService;

@RestController
public class VilleController {

	@Autowired
	private VilleService service;
	
	@PostMapping(value = "/ajoutVille")
	public void ajoutVille(@RestController VilleDTO v) {
		service.ajoutVille(v);
	}
	
	@PostMapping(value = "/recupVille")
	public VilleDTO recupVille(@RequestBody String id) {
		return service.recupVille(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/recupAllVille")
	public List<VilleDTO> recupAllVille() {
		return service.recupAllVille();
	}
	
	@PostMapping(value = "/supprimerVille")
	public void supprimerVille(@RequestBody String id) {
		service.supprimerVille(Integer.parseInt(id));
	}
	
}
