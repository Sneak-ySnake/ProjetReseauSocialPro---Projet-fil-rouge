package fr.cda.tender_du_poulet.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import fr.cda.tender_du_poulet.beans.Admin;
import fr.cda.tender_du_poulet.dao.AdminRepository;

@Controller
public class AdminController {
	
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
