package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.cda.tender_du_poulet.dao.AdministrerUtilisateurRepository;
import fr.cda.tender_du_poulet.dto.AdministrerUtilisateurDTO;
import fr.cda.tender_du_poulet.iService.AdministrerUtilisateurInterfaceService;
import fr.cda.tender_du_poulet.util.AdministrerUtilisateurConverter;

@Service
public class AdministrerUtilisateurService implements AdministrerUtilisateurInterfaceService {
	
	private AdministrerUtilisateurConverter converter = new AdministrerUtilisateurConverter();
	
	@Autowired
	AdministrerUtilisateurRepository administrerUtilisateurRepo;
	
	public void ajoutAdministrerUtilisateur(AdministrerUtilisateurDTO au) {
		administrerUtilisateurRepo.save(converter.dtoVersEntity(au));	
	}
	
	public AdministrerUtilisateurDTO recupAdministrerUtilisateur(int id) {
		return converter.entityVersDto(administrerUtilisateurRepo.findById(id).get());
	}
	
	public List<AdministrerUtilisateurDTO> recupAllAdministrerUtilisateur (int id) {
		return converter.entityVersDto(administrerUtilisateurRepo.findAll());
	}

}
