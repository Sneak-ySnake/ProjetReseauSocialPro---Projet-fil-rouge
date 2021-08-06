package fr.cda.tender_du_poulet.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import fr.cda.tender_du_poulet.beans.AdministrerUtilisateurId;
import fr.cda.tender_du_poulet.dto.AdministrerUtilisateurDTO;
import fr.cda.tender_du_poulet.service.AdministrerUtilisateurService;

@RestController
public class AdministrerUtilisateurController {

	@Autowired
	private AdministrerUtilisateurService au;

	@PostMapping(value = "/addAdministrerUtilisateur")
	public void addAdministrerUtilisateur(@RequestBody AdministrerUtilisateurDTO a) { 
		au.addAdministrerUtilisateur(a);
	}
	
	@PostMapping (value ="/findAdministrerUtilisateur")
	public AdministrerUtilisateurDTO findAdministrerUtilisateur (@RequestBody AdministrerUtilisateurId id ) {
		return au.findAdministrerUtilisateur(id);
	}
	
	@GetMapping (value = "/findAllAdministrerUtilisateur")
	public List<AdministrerUtilisateurDTO> findAllAdministrerUtilisateur() {
		return au.findAllAdministrerUtilisateur();	
	}
	
	@PostMapping (value = "/deleteAdministrerUtilisateur")
	public void deleteAdministrerUtilisateur(@RequestBody AdministrerUtilisateurId id) {
		au.deleteAdministrerUtilisateur(id);
	}
	
	@PostMapping (value = "/updateAdministrerUtilisateur")
	public void updateAdministrerUtilisateur (@RequestBody AdministrerUtilisateurDTO a) {
		au.updateAdministrerUtilisateur(a);
	}

	}
