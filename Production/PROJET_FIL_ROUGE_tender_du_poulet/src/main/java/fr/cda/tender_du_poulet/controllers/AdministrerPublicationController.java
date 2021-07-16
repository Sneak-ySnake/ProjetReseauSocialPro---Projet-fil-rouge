package fr.cda.tender_du_poulet.controllers;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import fr.cda.tender_du_poulet.beans.ActionSurPublication;
import fr.cda.tender_du_poulet.beans.Admin;
import fr.cda.tender_du_poulet.beans.AdministrerPublication;
import fr.cda.tender_du_poulet.beans.AdministrerPublicationId;
import fr.cda.tender_du_poulet.beans.Domaine;
import fr.cda.tender_du_poulet.beans.EtatPublication;
import fr.cda.tender_du_poulet.beans.Publication;
import fr.cda.tender_du_poulet.beans.StatutPublication;
import fr.cda.tender_du_poulet.beans.TypePublication;
import fr.cda.tender_du_poulet.beans.Utilisateur;
import fr.cda.tender_du_poulet.dao.AdministrerPublicationRepository;
import fr.cda.tender_du_poulet.dao.DomaineRepository;
import fr.cda.tender_du_poulet.dao.EtatPublicationRepository;
import fr.cda.tender_du_poulet.dao.PublicationRepository;
import fr.cda.tender_du_poulet.dao.StatutPublicationRepository;
import fr.cda.tender_du_poulet.dao.TypePublicationRepository;
import fr.cda.tender_du_poulet.dao.UtilisateurRepository;

@Controller
public class AdministrerPublicationController {
	
	@Autowired
	private AdministrerPublicationRepository administrerPublicationRepo;
	
	@Autowired
	private PublicationRepository publicationRepo;
	
	@Autowired
	private TypePublicationRepository typePublicationRepo;
	
	@Autowired
	private EtatPublicationRepository etatPublicationRepo;
	
	@Autowired
	private StatutPublicationRepository statutPublicationRepo;
	
	@Autowired
	private DomaineRepository domaineRepo;
	
	@Autowired
	private UtilisateurRepository utilrepo;
	
	
	@GetMapping(value = "/creerAdministrerPublication")
	public String creerAdministrerPublication() {
		
		int id = 1;
		Admin idAdmin = new Admin(id);
		
		int idActionSurPubli = 1;
		ActionSurPublication idActionSurPublication = new ActionSurPublication(idActionSurPubli);
		
		String typepub = "offre";
		TypePublication typeP = new TypePublication (typepub);
		typePublicationRepo.save(typeP);
		
		String statutpub = "privé";
		StatutPublication statutP = new StatutPublication (statutpub);
		statutPublicationRepo.save(statutP);
		
		String etatpub = "archives";
		EtatPublication etatP = new EtatPublication (etatpub);
		etatPublicationRepo.save(etatP);
		
		Domaine domaine1 = new Domaine("nomDomaineTestAdmin");
		domaineRepo.save(domaine1);
		
		Utilisateur util = new Utilisateur("nom3", "prenom3", "0123456789", "59000", "poste2", "email2", "mdp1", domaine1);
		utilrepo.save(util);
		
		Date dateDebut = null;
		try {
			dateDebut = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2021-06-07");
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		Date dateActionAdmin = null;
		try {
			dateActionAdmin = (Date) new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-12");
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	
		Publication publication = new Publication ("nompub", "decriptionpub", 20, "typeproduit", dateDebut, 25, 
				util, typeP, statutP, etatP);
		publicationRepo.save(publication);
		
		AdministrerPublicationId administrerPublicationId = new AdministrerPublicationId (idAdmin, idActionSurPublication, publication, dateActionAdmin);
		
		AdministrerPublication adminpublication = new AdministrerPublication(administrerPublicationId);
		
		administrerPublicationRepo.save(adminpublication);
		return "home";
		
	}
	
	

}
