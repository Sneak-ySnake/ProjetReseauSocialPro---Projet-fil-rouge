package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteDTO;
import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteIdDTO;
import fr.cda.tender_du_poulet.service.Utilisateur_EtatCompteService;

@RestController
public class Utilisateur_EtatCompteController {
	
	@Autowired
	private Utilisateur_EtatCompteService utilisateur_EtatCompteService;
	
	@RequestMapping(value = "/addUtilisateur_EtatCompte", method = RequestMethod.POST)
	public void addUtilisateur_EtatCompte(@RequestBody Utilisateur_EtatCompteDTO d) {
		utilisateur_EtatCompteService.addUtilisateur_EtatCompte(d);
	}

	@RequestMapping(value = "/findUtilisateur_EtatCompte", method = RequestMethod.POST)
	public Utilisateur_EtatCompteDTO findUtilisateur_EtatCompte(@RequestBody Utilisateur_EtatCompteIdDTO id) {
		return utilisateur_EtatCompteService.findUtilisateur_EtatCompte(id);
	}
	
	@RequestMapping(value = "/findAllUtilisateur_EtatCompte", method = RequestMethod.POST)
	public List<Utilisateur_EtatCompteDTO> findAllUtilisateur_EtatCompte() {
		return utilisateur_EtatCompteService.findAllUtilisateur_EtatCompte();
	}

	@RequestMapping(value = "/updateUtilisateur_EtatCompte", method = RequestMethod.POST)
	public void updateUtilisateur_EtatCompte(@RequestBody Utilisateur_EtatCompteDTO d) {
		utilisateur_EtatCompteService.updateUtilisateur_EtatCompte(d);
	}

	@RequestMapping(value = "/deleteUtilisateur_EtatCompte", method = RequestMethod.POST)
	public void deleteUtilisateur_EtatCompte(@RequestBody Utilisateur_EtatCompteIdDTO id) {
		utilisateur_EtatCompteService.deleteUtilisateur_EtatCompte(id);
	}
}
