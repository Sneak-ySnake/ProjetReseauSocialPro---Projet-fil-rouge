package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.EtatCompteDTO;
import fr.cda.tender_du_poulet.service.EtatCompteService;

@RestController
public class EtatCompteController {
	
	@Autowired
	private EtatCompteService etatCompteService;
	
	@RequestMapping(value = "/addEtatCompte", method = RequestMethod.POST)
	public void addEtatCompte(@RequestBody EtatCompteDTO d) {
		etatCompteService.addEtatCompte(d);
	}

	@RequestMapping(value = "/findEtatCompte", method = RequestMethod.POST)
	public EtatCompteDTO findEtatCompte(@RequestBody String id) {
		int idEtatCompte = Integer.parseInt(id);
		return etatCompteService.findEtatCompte(idEtatCompte);
	}
	
	@RequestMapping(value = "/findAllEtatCompte", method = RequestMethod.POST)
	public List<EtatCompteDTO> findAllEtatCompte() {
		return etatCompteService.findAllEtatCompte();
	}

	@RequestMapping(value = "/updateEtatCompte", method = RequestMethod.POST)
	public void updateEtatCompte(@RequestBody EtatCompteDTO d) {
		etatCompteService.updateEtatCompte(d);
	}

	@RequestMapping(value = "/deleteEtatCompte", method = RequestMethod.POST)
	public void deleteEtatCompte(@RequestBody String id) {
		int idEtatCompte = Integer.parseInt(id);
		etatCompteService.deleteEtatCompte(idEtatCompte);
	}
}
