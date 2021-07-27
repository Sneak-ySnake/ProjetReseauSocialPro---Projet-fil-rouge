package fr.cda.tender_du_poulet.controllers; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.NegociationDTO;
import fr.cda.tender_du_poulet.service.NegociationService;

@RestController
public class NegociationController {

	@Autowired
	private NegociationService negociationService = new NegociationService();
	
	@GetMapping(value = "/recupAllNegociation")
	public List<NegociationDTO> recupAllNegociation() {
		return negociationService.recupAllNegociation();
	}
	
	@PostMapping(value = "/recupNegociation")
	public NegociationDTO recupNegociation(@RequestBody String id) {
		return negociationService.recupNegociation(Integer.parseInt(id));
	}
	
	@PostMapping(value = "/ajoutNegociation")
	public void ajoutNegociation(@RequestBody NegociationDTO n) {
		negociationService.ajoutNegociation(n);
	}
	
	
}
