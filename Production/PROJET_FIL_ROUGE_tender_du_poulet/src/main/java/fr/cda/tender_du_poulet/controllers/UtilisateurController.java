package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.UtilisateurDTO;
import fr.cda.tender_du_poulet.metiers.UtilisateurVerif;
import fr.cda.tender_du_poulet.service.UtilisateurService;

@RestController
public class UtilisateurController {

	@Autowired
	private UtilisateurService utilisateurService;
 
	private UtilisateurVerif utilisateurVerif = new UtilisateurVerif();
	
	@RequestMapping(value = "/addUtilisateur", method = RequestMethod.POST)
	public void ajoutUtilisateur(@RequestBody UtilisateurDTO u) {
		utilisateurService.ajoutUtilisateur(u);
	}

	@RequestMapping(value = "/findUtilisateur", method = RequestMethod.POST)
	public UtilisateurDTO recupUtilisateur(@RequestParam(name = "id") String id) {
		int idUtilisateur = Integer.parseInt(id);
		return utilisateurService.recupUtilisateur(idUtilisateur);
	}
	
	@RequestMapping(value = "/findAllUtilisateur", method = RequestMethod.POST)
	public List<UtilisateurDTO> recupAllUtilisateur() {
		return utilisateurService.recupAllUtilisateur();
	}

	@RequestMapping(value = "/updateUtilisateur", method = RequestMethod.POST)
	public void modifUtilisateur(@RequestBody UtilisateurDTO u) {
		utilisateurService.modifUtilisateur(u);
	}

	@RequestMapping(value = "/deleteUtilisateur", method = RequestMethod.POST)
	public void supprimerUtilisateur(@RequestParam(name = "id") String id) {
		int idUtilisateur = Integer.parseInt(id);
		utilisateurService.supprimerUtilisateur(idUtilisateur);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public UtilisateurDTO loginUtilisateur(@RequestBody UtilisateurDTO u) {
		String email = u.getEmail_utilisateur();
		String mdp = u.getMot_de_passe_utilisateur();
		UtilisateurDTO utilisateur = utilisateurService.recupUtilisateurEmail(email);
		if(utilisateurVerif.verifLogin(utilisateur, mdp)) {
			return utilisateur;
		}
		else return null;
	}
	/*
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Boolean loginUtilisateur(@RequestParam(name = "email") String email,
								 @RequestParam(name = "mdp") String mdp) {
		UtilisateurDTO u = utilisateurService.recupUtilisateurEmail(email);
		return utilisateurVerif.verifLogin(u, mdp);
	}
	*/
}
