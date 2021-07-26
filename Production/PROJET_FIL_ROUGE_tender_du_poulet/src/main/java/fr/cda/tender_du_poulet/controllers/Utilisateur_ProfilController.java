package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.Utilisateur_ProfilId;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilDTO;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilIdDTO;
import fr.cda.tender_du_poulet.service.Utilisateur_ProfilService;

@RestController
public class Utilisateur_ProfilController {
	@Autowired
	private Utilisateur_ProfilService utilisateur_ProfilService;
	
	@RequestMapping(value = "/addUtilisateur_Profil", method = RequestMethod.POST)
	public void ajoutUtilisateur_Profil(@RequestBody Utilisateur_ProfilDTO d) {
		utilisateur_ProfilService.ajoutUtilisateur_Profil(d);
	}

	@RequestMapping(value = "/findUtilisateur_Profil", method = RequestMethod.POST)
	public Utilisateur_ProfilDTO recupUtilisateur_Profil(@RequestBody Utilisateur_ProfilIdDTO id) {
		return utilisateur_ProfilService.recupUtilisateur_Profil(id);
	}
	
	@RequestMapping(value = "/findAllUtilisateur_Profil", method = RequestMethod.POST)
	public List<Utilisateur_ProfilDTO> recupAllUtilisateur_Profil() {
		return utilisateur_ProfilService.recupAllUtilisateur_Profil();
	}

	@RequestMapping(value = "/updateUtilisateur_Profil", method = RequestMethod.POST)
	public void modifUtilisateur_Profil(@RequestBody Utilisateur_ProfilDTO d) {
		utilisateur_ProfilService.modifUtilisateur_Profil(d);
	}

	@RequestMapping(value = "/deleteUtilisateur_Profil", method = RequestMethod.POST)
	public void supprimerUtilisateur_Profil(@RequestBody Utilisateur_ProfilId id) {
		utilisateur_ProfilService.supprimerUtilisateur_Profil(id);
	}
}
