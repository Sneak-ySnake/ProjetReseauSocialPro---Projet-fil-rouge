package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.AdministrerPublicationId;
import fr.cda.tender_du_poulet.dto.AdministrerPublicationDTO;
import fr.cda.tender_du_poulet.service.AdministrerPublicationService;

@RestController
public class AdministrerPublicationController {
	
	@Autowired
	private AdministrerPublicationService aps;
	
	
	@PostMapping(value = "/addAdministrerPublication")
	public void addAdministrerPublication(@RequestBody AdministrerPublicationDTO a) { 
		aps.addAdministrerPublication(a);
	}
	
	@PostMapping (value ="/findAdministrerPublication")
	public AdministrerPublicationDTO findAdministrerPublication (@RequestBody AdministrerPublicationId id ) {
		return aps.findAdministrerPublication(id);
	}
	
	@GetMapping (value = "/findAllAdministrerPublication")
	public List<AdministrerPublicationDTO> findAllAdministrerPublication() {
		return aps.findAllAdministrerPublication();	
	}
	
	@PostMapping (value = "/deleteAdministrerPublication")
	public void deleteAdministrerPublication(@RequestBody AdministrerPublicationId id) {
		aps.deleteAdministrerPublication(id);
	}
	
	@PostMapping (value = "/updateAdministrerPublication")
	public void updateAdministrerPublication (@RequestBody AdministrerPublicationDTO ap) {
		aps.updateAdministrerPublication(ap);
	}
	
}
