package fr.cda.tender_du_poulet.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.Admin;
import fr.cda.tender_du_poulet.dao.AdminRepository;
import fr.cda.tender_du_poulet.dto.AdminDTO;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;
import fr.cda.tender_du_poulet.iService.AdminInterfaceService;
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
	
	
	@RestController
	public class AdminController {
	/////Le Controller lors du test Mapping
	//@Autowired
	//private AdminRepository adminRepository;
		
	@Autowired
	private AdminInterfaceService ads;
		
	
	@GetMapping (value = "/creerAdmin")
	public String ajouterAdmin (@RequestBody AdminDTO a) {
		
		//String compte_admin = "testCompte";
		//String mot_de_passe_admin = "testMdp";
		//AdminDTO a = new AdminDTO(compte_admin, mot_de_passe_admin);
		//AdminService ads = new AdminService();
		//ads.ajoutAdmin(a);
		//System.out.println(compte_admin + " " + mot_de_passe_admin);
		ads.ajoutAdmin(a);
		System.out.println(a.getId_admin());
		return "home";
	}
	
	
	@GetMapping (value = "/deleteAdmin")
	public String deleteAdmin() {
		AdminService ads = new AdminService();	
		AdminDTO a = new AdminDTO();
		ads.ajoutAdmin(a);
		System.out.println("Ajout valeur de a = " + a.getId_admin());
		ads.deleteAdmin(a);
		System.out.println("Delete valeur de a = " + a.getId_admin());
		return "home";	
	}
	
	@GetMapping (value ="/recupAdmin")
	public String recupAdmin () {
		AdminService ads = new AdminService();
		String compte_admin = "testCompteRecup";
		String mot_de_passe_admin = "testMdpRecup";
		AdminDTO admin = new AdminDTO(compte_admin, mot_de_passe_admin);
		ads.ajoutAdmin(admin);
		System.out.println("id admin = " + admin.getId_admin() + " " + admin.getCompte_admin() + " " + admin.getMot_de_passe_admin());
		return "home";
	}
	
	
	
	
	
	
	}


