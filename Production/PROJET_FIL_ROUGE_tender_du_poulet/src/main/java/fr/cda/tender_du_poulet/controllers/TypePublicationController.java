package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.TypePublicationDTO;
import fr.cda.tender_du_poulet.service.TypePublicationService;

@RestController
public class TypePublicationController {

	@Autowired
	private TypePublicationService service;
	
	@PostMapping(value = "/findpTypePublication")
	public TypePublicationDTO findTypePublication(@RequestBody String id) {
		return service.findTypePublication(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/findAllTypePublication")
	public List<TypePublicationDTO> findAllTypePublication() {
		return service.findAllTypePublication();
	}
	
	@PostMapping("/addTypePublication")
	public void addTypePublication(@RequestBody TypePublicationDTO t) {
		service.addTypePublication(t);		
	}
	
	@PostMapping("/deleteTypePublication")
	public void deleteTypePublication(@RequestBody String id) {
		service.deleteTypePublication(Integer.parseInt(id));
	}
	
	@PostMapping("/updateTypePublication")
	public void updateTypePublication(@RequestBody TypePublicationDTO t) {
		service.updateTypePublication(t);
	}
	
}
