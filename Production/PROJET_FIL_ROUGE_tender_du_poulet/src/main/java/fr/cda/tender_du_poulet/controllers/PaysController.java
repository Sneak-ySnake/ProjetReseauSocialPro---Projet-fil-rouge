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
	
	@PostMapping(value = "/addPays")
	public void addPays(@RequestBody PaysDTO p) {
		service.addPays(p);
	}
	
	@PostMapping(value = "/findPays")
	public PaysDTO findPays(@RequestBody String id) {
		return service.findPays(Integer.parseInt(id));
	}
	
	@GetMapping(value = "/findAllPays")
	public List<PaysDTO> findAllPays() {
		return service.findAllPays();
	}
	
	@PostMapping(value = "/deletePays")
	public void deletePays(@RequestBody String id) {
		service.deletePays(Integer.parseInt(id));
	}
	
}
