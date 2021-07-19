package fr.cda.tender_du_poulet.controllers; 

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.cda.tender_du_poulet.dto.NegociationDTO;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.service.NegociationService;

@Controller
public class NegociationController {


	private NegociationService service = new NegociationService();
	
	@GetMapping(value = "/recupNegociations")
	public List<NegociationDTO> recupAllNegociation() {
		return service.recupAllNegociation();
	}
	
	@GetMapping(value = "/recupNegociation")
	public NegociationDTO recupNegociation(int id) {
		return service.recupNegociation(id);
	}
	
	@PostMapping(value = "/ajoutNegociation")
	public void AjoutNegociation(NegociationDTO n) {
		service.ajoutNegociation(n);
	}
	
	
}
