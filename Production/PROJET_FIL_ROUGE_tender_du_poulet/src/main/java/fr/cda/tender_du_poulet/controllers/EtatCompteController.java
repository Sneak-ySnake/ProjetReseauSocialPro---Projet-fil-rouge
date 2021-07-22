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
	public void ajoutEtatCompte(@RequestBody EtatCompteDTO d) {
		etatCompteService.ajoutEtatCompte(d);
	}

	@RequestMapping(value = "/findEtatCompte", method = RequestMethod.POST)
	public EtatCompteDTO recupEtatCompte(@RequestBody String id) {
		int idEtatCompte = Integer.parseInt(id);
		return etatCompteService.recupEtatCompte(idEtatCompte);
	}
	
	@RequestMapping(value = "/findAllEtatCompte", method = RequestMethod.POST)
	public List<EtatCompteDTO> recupAllEtatCompte() {
		return etatCompteService.recupAllEtatCompte();
	}

	@RequestMapping(value = "/updateEtatCompte", method = RequestMethod.POST)
	public void modifEtatCompte(@RequestBody EtatCompteDTO d) {
		etatCompteService.modifEtatCompte(d);
	}

	@RequestMapping(value = "/deleteEtatCompte", method = RequestMethod.POST)
	public void supprimerEtatCompte(@RequestBody String id) {
		int idEtatCompte = Integer.parseInt(id);
		etatCompteService.supprimerEtatCompte(idEtatCompte);
	}
}
