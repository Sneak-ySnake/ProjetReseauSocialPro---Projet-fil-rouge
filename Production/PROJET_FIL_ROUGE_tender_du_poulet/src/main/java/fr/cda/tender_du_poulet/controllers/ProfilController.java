package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.ProfilDTO;
import fr.cda.tender_du_poulet.service.ProfilService;

@RestController
public class ProfilController {
	
	@Autowired
	private ProfilService profilService;

	@RequestMapping(value = "/addProfil", method = RequestMethod.POST)
	public void ajoutProfil(@RequestBody ProfilDTO d) {
		profilService.ajoutProfil(d);
	}

	@RequestMapping(value = "/findProfil", method = RequestMethod.POST)
	public ProfilDTO recupProfil(@RequestBody String id) {
		int idProfil = Integer.parseInt(id);
		return profilService.recupProfil(idProfil);
	}
	
	@RequestMapping(value = "/findAllProfil", method = RequestMethod.POST)
	public List<ProfilDTO> recupAllProfil() {
		return profilService.recupAllProfil();
	}

	@RequestMapping(value = "/updateProfil", method = RequestMethod.POST)
	public void modifProfil(@RequestBody ProfilDTO d) {
		profilService.modifProfil(d);
	}

	@RequestMapping(value = "/deleteProfil", method = RequestMethod.POST)
	public void supprimerProfil(@RequestBody String id) {
		int idProfil = Integer.parseInt(id);
		profilService.supprimerProfil(idProfil);
	}
}
