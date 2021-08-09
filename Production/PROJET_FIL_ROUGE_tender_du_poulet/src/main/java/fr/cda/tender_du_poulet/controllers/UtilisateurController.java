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
	public void addUtilisateur(@RequestBody UtilisateurDTO u) {
		utilisateurService.addUtilisateur(u);
	}

	@RequestMapping(value = "/findUtilisateur", method = RequestMethod.POST)
	public UtilisateurDTO findUtilisateur(@RequestBody String id) {
		int idUtilisateur = Integer.parseInt(id);
		return utilisateurService.findUtilisateur(idUtilisateur);
	}
	
	@RequestMapping(value = "/findAllUtilisateur", method = RequestMethod.GET)
	public List<UtilisateurDTO> findAllUtilisateur() {
		return utilisateurService.findAllUtilisateur();
	}

	@RequestMapping(value = "/updateUtilisateur", method = RequestMethod.POST)
	public void updateUtilisateur(@RequestBody UtilisateurDTO u) {
		utilisateurService.updateUtilisateur(u);
	}

	@RequestMapping(value = "/deleteUtilisateur", method = RequestMethod.POST)
	public void deleteUtilisateur(@RequestParam(name = "id") String id) {
		int idUtilisateur = Integer.parseInt(id);
		utilisateurService.deleteUtilisateur(idUtilisateur);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public UtilisateurDTO loginUtilisateur(@RequestBody UtilisateurDTO u) {
		String email = u.getEmail_utilisateur();
		String mdp = u.getMot_de_passe_utilisateur();
		UtilisateurDTO utilisateur = utilisateurService.findUtilisateurEmail(email);
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
