package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilDTO;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilIdDTO;
import fr.cda.tender_du_poulet.service.Utilisateur_ProfilService;

@RestController
public class Utilisateur_ProfilController {
	@Autowired
	private Utilisateur_ProfilService utilisateur_ProfilService;
	
	@RequestMapping(value = "/addUtilisateur_Profil", method = RequestMethod.POST)
	public void addUtilisateur_Profil(@RequestBody Utilisateur_ProfilDTO d) {
		utilisateur_ProfilService.addUtilisateur_Profil(d);
	}

	@RequestMapping(value = "/findUtilisateur_Profil", method = RequestMethod.POST)
	public Utilisateur_ProfilDTO findUtilisateur_Profil(@RequestBody Utilisateur_ProfilIdDTO id) {
		return utilisateur_ProfilService.findUtilisateur_Profil(id);
	}
	
	@RequestMapping(value = "/findAllUtilisateur_Profil", method = RequestMethod.GET)
	public List<Utilisateur_ProfilDTO> findAllUtilisateur_Profil() {
		return utilisateur_ProfilService.findAllUtilisateur_Profil();
	}

	@RequestMapping(value = "/updateUtilisateur_Profil", method = RequestMethod.POST)
	public void updateUtilisateur_Profil(@RequestBody Utilisateur_ProfilDTO d) {
		utilisateur_ProfilService.updateUtilisateur_Profil(d);
	}

	@RequestMapping(value = "/deleteUtilisateur_Profil", method = RequestMethod.POST)
	public void deleteUtilisateur_Profil(@RequestBody Utilisateur_ProfilIdDTO id) {
		utilisateur_ProfilService.deleteUtilisateur_Profil(id);
	}
}
