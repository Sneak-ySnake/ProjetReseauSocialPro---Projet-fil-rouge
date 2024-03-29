package fr.cda.tender_du_poulet.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.AdminDTO;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;
import fr.cda.tender_du_poulet.metiers.AdminVerif;
import fr.cda.tender_du_poulet.metiers.UtilisateurVerif;
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
	private AdminService ads;
	
	private AdminVerif administrateurVerif = new AdminVerif();
		
	
	@PostMapping (value = "/addAdmin")
	public void addAdmin (@RequestBody AdminDTO a) {
		ads.addAdmin(a);
	}
	
	@PostMapping (value ="/findAdmin")
	public AdminDTO findAdmin (@RequestBody String id) {
		int idAdmin = Integer.parseInt(id);
		return ads.findAdmin(idAdmin);
	}
	
	@GetMapping (value = "/findAllAdmin")
	public List<AdminDTO> findAllAdmin() {
		return ads.findAllAdmin();	
	}
	
	@PostMapping (value = "/deleteAdmin")
	public void deleteAdmin(@RequestBody String id) {
		int idAdmin = Integer.parseInt(id);
		ads.deleteAdmin(idAdmin);
	}
	
	@PostMapping (value ="/updateAdmin")
	public void updateAdmin(@RequestBody AdminDTO a) {
		ads.updateAdmin(a);
	}
	
	@RequestMapping(value = "/loginAdmin", method = RequestMethod.POST)
	public AdminDTO loginAdministrateur(@RequestBody AdminDTO a) {
		String email = a.getMail_admin();
		String mdp = a.getMot_de_passe_admin();
		AdminDTO administrateur = ads.findAdministrateurEmail(email);
		if(administrateurVerif.verifLogin(administrateur, mdp)) {
			return administrateur;
		}
		else return null;
	}
	}


