package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.Utilisateur_EtatCompteId;
import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteDTO;
import fr.cda.tender_du_poulet.service.Utilisateur_EtatCompteService;

@RestController
public class Utilisateur_EtatCompteController {
	
	@Autowired
	private Utilisateur_EtatCompteService utilisateur_EtatCompteService;
	
	@RequestMapping(value = "/addUtilisateur_EtatCompte", method = RequestMethod.POST)
	public void ajoutUtilisateur_EtatCompte(@RequestBody Utilisateur_EtatCompteDTO d) {
		utilisateur_EtatCompteService.ajoutUtilisateur_EtatCompte(d);
	}

	@RequestMapping(value = "/findUtilisateur_EtatCompte", method = RequestMethod.POST)
	public Utilisateur_EtatCompteDTO recupUtilisateur_EtatCompte(@RequestBody Utilisateur_EtatCompteId id) {
		return utilisateur_EtatCompteService.recupUtilisateur_EtatCompte(id);
	}
	
	@RequestMapping(value = "/findAllUtilisateur_EtatCompte", method = RequestMethod.POST)
	public List<Utilisateur_EtatCompteDTO> recupAllUtilisateur_EtatCompte() {
		return utilisateur_EtatCompteService.recupAllUtilisateur_EtatCompte();
	}

	@RequestMapping(value = "/updateUtilisateur_EtatCompte", method = RequestMethod.POST)
	public void modifUtilisateur_EtatCompte(@RequestBody Utilisateur_EtatCompteDTO d) {
		utilisateur_EtatCompteService.modifUtilisateur_EtatCompte(d);
	}

	@RequestMapping(value = "/deleteUtilisateur_EtatCompte", method = RequestMethod.POST)
	public void supprimerUtilisateur_EtatCompte(@RequestBody Utilisateur_EtatCompteId id) {
		utilisateur_EtatCompteService.supprimerUtilisateur_EtatCompte(id);
	}
}
