package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.UtilisateurDTO;
import fr.cda.tender_du_poulet.service.UtilisateurService;

@RestController
public class UtilisateurController {

	@Autowired
	private UtilisateurService utilisateurService;
 
	@RequestMapping(value = "/addUtilisateur", method = RequestMethod.POST)
	public void ajoutUtilisateur(@RequestBody UtilisateurDTO u) {
		utilisateurService.ajoutUtilisateur(u);
	}

	@RequestMapping(value = "/findUtilisateur", method = RequestMethod.POST)
	public UtilisateurDTO recupUtilisateur(@RequestBody String id) {
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
	public void supprimerUtilisateur(@RequestBody String id) {
		int idUtilisateur = Integer.parseInt(id);
		utilisateurService.supprimerUtilisateur(idUtilisateur);
	}
	
}
