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
	private NegociationService service = new NegociationService();
	
	@GetMapping(value = "/recupNegociations")
	public List<NegociationDTO> recupAllNegociation() {
		return service.recupAllNegociation();
	}
	
	@PostMapping(value = "/recupNegociation")
	public NegociationDTO recupNegociation(@RequestBody int id) {
		return service.recupNegociation(id);
	}
	
	@PostMapping(value = "/ajoutNegociation")
	public void AjoutNegociation(@RequestBody NegociationDTO n) {
		service.ajoutNegociation(n);
	}
	
	
}
