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
	
	@PostMapping(value = "/addVille")
	public void addVille(@RequestBody VilleDTO v) {
		service.addVille(v);
	}
	
	@PostMapping(value = "/findVille")
	public VilleDTO findVille(@RequestBody String id) {
		return service.findVille(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/findAllVille")
	public List<VilleDTO> findAllVille() {
		return service.findAllVille();
	}
	
	@PostMapping(value = "/deleteVille")
	public void deleteVille(@RequestBody String id) {
		service.deleteVille(Integer.parseInt(id));
	}
	
}
