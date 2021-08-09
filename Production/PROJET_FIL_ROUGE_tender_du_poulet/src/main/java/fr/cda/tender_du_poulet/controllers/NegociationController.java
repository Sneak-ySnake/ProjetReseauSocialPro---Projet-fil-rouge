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
	
	@GetMapping(value = "/findAllNegociation")
	public List<NegociationDTO> findAllNegociation() {
		return negociationService.findAllNegociation();
	}
	
	@PostMapping(value = "/findNegociation")
	public NegociationDTO findNegociation(@RequestBody String id) {
		return negociationService.findNegociation(Integer.parseInt(id));
	}
	
	@PostMapping(value = "/addNegociation")
	public void addNegociation(@RequestBody NegociationDTO n) {
		negociationService.addNegociation(n);
	}
	
	@PostMapping(value = "/deleteNegociation")
	public void deleteNegociation(@RequestBody String id) {
		negociationService.deleteNegociation(Integer.parseInt(id));
	}
	
	@PostMapping(value = "/updateNegociation")
	public void updateNegociation(@RequestBody NegociationDTO n) {
		negociationService.updateNegociation(n);
	}
}
