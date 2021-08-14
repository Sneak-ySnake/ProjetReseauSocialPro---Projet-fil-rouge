package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;
import fr.cda.tender_du_poulet.metiers.PublicationVerif;
import fr.cda.tender_du_poulet.service.PublicationService;

@RestController
public class PublicationController {

	@Autowired
	private PublicationService service;
	
	private PublicationVerif publicationVerif = new PublicationVerif();
	
	@GetMapping(value = "/findAllPublication")
	public List<PublicationDTO> findAllPublication() {
		return service.findAllPublication();
	}
	
	@PostMapping(value = "/findPublication")
	public PublicationDTO findPublication(@RequestBody PublicationDTO p) {
		return service.findPublication(p.getId_publication());
	}
	
	@PostMapping(value = "/addPublication")
	public void addPublication(@RequestBody PublicationDTO p) {
		service.addPublication(p);
	}
	
	@PostMapping(value = "/deletePublication")
	public void deletePublication(@RequestBody String id) {
		service.deletePublication(Integer.parseInt(id));
	}
	
	@PostMapping(value = "/updatePublication")
	public void updatePublication(@RequestBody PublicationDTO p) {
		service.updatePublication(p);
	}
	
	@PostMapping(value = "/findAllDemandeUtilisateur")
	public List<PublicationDTO> findAllDemandeUtilisateur(@RequestBody UtilisateurDTO u) {
		return service.findAllDemandeUtilisateur(u);
	}
	
	@PostMapping(value = "/findAllOffreUtilisateur")
	public List<PublicationDTO> findAllOffreUtilisateur(@RequestBody UtilisateurDTO u) {
		return service.findAllOffreUtilisateur(u);
	}
	
	@PostMapping(value = "/publierVerification")
	public boolean publicationVerification(@RequestBody PublicationDTO p) {
		if(publicationVerif.isNotEmpty(p.getNom_publication(), p.getDescription_publication(), p.getPrix(), 
				p.getType_produit(), ""+p.getDate_publication(), p.getQuantite(), p.getUtilisateur(),
				p.getType_publication(), p.getStatut_publication(), p.getEtat_publication())) {
			if(publicationVerif.isTypeOk(p.getPrix(), ""+p.getDate_publication(), p.getQuantite(), p.getUtilisateur(),
					p.getType_publication(), p.getStatut_publication(), p.getEtat_publication())) {
				if(publicationVerif.isValeurOk(p.getPrix(), p.getQuantite(), p.getUtilisateur(),
						p.getType_publication(), p.getStatut_publication(), p.getEtat_publication())) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
}
