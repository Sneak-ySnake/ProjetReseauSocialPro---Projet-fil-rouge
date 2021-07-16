package fr.cda.tender_du_poulet.controllers;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fr.cda.tender_du_poulet.beans.ActionSurUtilisateur;
import fr.cda.tender_du_poulet.beans.Admin;
import fr.cda.tender_du_poulet.beans.AdministrerUtilisateur;
import fr.cda.tender_du_poulet.beans.AdministrerUtilisateurId;
import fr.cda.tender_du_poulet.beans.Domaine;
import fr.cda.tender_du_poulet.beans.Utilisateur;
import fr.cda.tender_du_poulet.dao.AdministrerUtilisateurRepository;
import fr.cda.tender_du_poulet.dao.DomaineRepository;
import fr.cda.tender_du_poulet.dao.UtilisateurRepository;

@Controller
public class AdministrerUtilisateurController {

	@Autowired
	private AdministrerUtilisateurRepository administrerUtilisateurRepo;

	@Autowired
	private DomaineRepository domaineRepository;

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@GetMapping(value = "/creerAdministrerUtilisateur")
	public String creerAdministrerUtilisateur() {

		Domaine domaine1 = new Domaine("nomDomaine6");
		domaineRepository.save(domaine1);
		

		Utilisateur util = new Utilisateur("nom3", "prenom3", "0123456789", "59000", "poste2", "email2", "mdp1", domaine1);
		utilisateurRepository.save(util);

		int id = 1;
		Admin idAdmin = new Admin(id);

		int idActionSurUtil = 1;
		ActionSurUtilisateur idActionSurUtiliteur = new ActionSurUtilisateur(idActionSurUtil);

		Date dateDebut = null;
		try {
			dateDebut = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2021-06-07");
		} catch (Exception exc) {
			exc.printStackTrace();
		}

		AdministrerUtilisateurId administrerUtilisateurId = new AdministrerUtilisateurId(idAdmin, idActionSurUtiliteur,
				util, dateDebut);

		AdministrerUtilisateur adminUtil = new AdministrerUtilisateur(administrerUtilisateurId);

		administrerUtilisateurRepo.save(adminUtil);

		return "home";

	}
}
