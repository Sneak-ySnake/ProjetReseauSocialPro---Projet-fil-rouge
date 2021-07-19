package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.Admin;
import fr.cda.tender_du_poulet.dao.AdminRepository;
import fr.cda.tender_du_poulet.dto.AdminDTO;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;
import fr.cda.tender_du_poulet.service.AdminService;

/*
@RestController
public class AdminController {
	
	private AdminService service = new AdminService();
	
	@GetMapping(value = "/allerPageDashboardAdmin")
	public AdminDTO AllerPageDashboardAdmin(int id) {
		return service.recupAdmin(id);
	}
	
	@PostMapping ( value = "/allerPageListeUtilisateurAdmin")
	public List<UtilisateurDTO> allerPageListeUtilisateurAdmin() {
		return service.recupAllUtilisateur();	
	}
	
	@PostMapping (value = "/allerPagelistePublicationAdmin")
	public List<PublicationDTO> allerPageListePublicationAdmin() {
		return service.recupAllPublication();
	}
}*/
	
	
	@Controller
	public class AdminController {
	/////Le Controller lors du test Mapping
	@Autowired
	private AdminRepository adminRepository;
	
	@GetMapping (value = "/creerAdmin")
	public String ajouterAdmin () {
		
		String compte_admin = "testCompte";
		String mot_de_passe_admin = "testMdp";
		Admin a = new Admin(compte_admin, mot_de_passe_admin);
		adminRepository.save(a);
		System.out.println(compte_admin + " " + mot_de_passe_admin);
		return "home";
	}
	
	
	
	
	}


