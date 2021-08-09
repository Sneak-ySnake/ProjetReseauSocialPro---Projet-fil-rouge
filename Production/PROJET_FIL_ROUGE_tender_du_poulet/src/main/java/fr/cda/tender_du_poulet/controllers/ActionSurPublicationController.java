package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.ActionSurPublicationDTO;
import fr.cda.tender_du_poulet.service.ActionSurPublicationService;

@RestController
public class ActionSurPublicationController {
	
	@Autowired 
	private ActionSurPublicationService asps;
	
	
	@PostMapping (value = "/addActionSurPublication")
	public void addActionSurPublication(@RequestBody ActionSurPublicationDTO a) {
		asps.addActionSurPublication(a);
	}
	
	@PostMapping (value ="/findActionSurPublication")
	public ActionSurPublicationDTO findActionSurPublication (@RequestBody String id) {
		int idActionSurPublication = Integer.parseInt(id);
		return asps.findActionSurPublication(idActionSurPublication);
	}
	
	@GetMapping (value = "/findAllActionSurPublication")
	public List<ActionSurPublicationDTO> findAllActionSurPublication() {
		return asps.findAllActionSurPublication();	
	}
	
	@PostMapping (value = "/deleteActionSurPublication")
	public void deleteActionSurPublication(@RequestBody String id) {
		int idActionSurPublication = Integer.parseInt(id);
		asps.deleteActionSurPublication(idActionSurPublication);
	}
	
	@PostMapping (value = "/updateActionSurPublication")
	public void updateActionSurPublication (@RequestBody ActionSurPublicationDTO au) {
		asps.updateActionSurPublication(au);
	}
}
