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
	public void addProfil(@RequestBody ProfilDTO d) {
		profilService.addProfil(d);
	}

	@RequestMapping(value = "/findProfil", method = RequestMethod.POST)
	public ProfilDTO findProfil(@RequestBody String id) {
		int idProfil = Integer.parseInt(id);
		return profilService.findProfil(idProfil);
	}
	
	@RequestMapping(value = "/findAllProfil", method = RequestMethod.GET)
	public List<ProfilDTO> findAllProfil() {
		return profilService.findAllProfil();
	}

	@RequestMapping(value = "/updateProfil", method = RequestMethod.POST)
	public void updateProfil(@RequestBody ProfilDTO d) {
		profilService.updateProfil(d);
	}

	@RequestMapping(value = "/deleteProfil", method = RequestMethod.POST)
	public void deleteProfil(@RequestBody String id) {
		int idProfil = Integer.parseInt(id);
		profilService.deleteProfil(idProfil);
	}
}
