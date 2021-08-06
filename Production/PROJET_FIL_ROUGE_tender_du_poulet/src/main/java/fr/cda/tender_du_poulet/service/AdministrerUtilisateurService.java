package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.beans.AdministrerPublicationId;
import fr.cda.tender_du_poulet.beans.AdministrerUtilisateurId;
import fr.cda.tender_du_poulet.dao.AdministrerUtilisateurRepository;
import fr.cda.tender_du_poulet.dto.AdministrerUtilisateurDTO;
import fr.cda.tender_du_poulet.iService.AdministrerUtilisateurInterfaceService;
import fr.cda.tender_du_poulet.util.AdministrerUtilisateurConverter;

@Service
public class AdministrerUtilisateurService implements AdministrerUtilisateurInterfaceService {
	
	private AdministrerUtilisateurConverter converter = new AdministrerUtilisateurConverter();
	
	@Autowired
	private AdministrerUtilisateurRepository administrerUtilisateurRepo;
	
	public void addAdministrerUtilisateur(AdministrerUtilisateurDTO au) {
		administrerUtilisateurRepo.save(converter.dtoVersEntity(au));	
	}
	
	public AdministrerUtilisateurDTO findAdministrerUtilisateur(AdministrerUtilisateurId id) {
		return converter.entityVersDto(administrerUtilisateurRepo.findById(id).get());
	}
	
	public List<AdministrerUtilisateurDTO> findAllAdministrerUtilisateur () {
		return converter.entityVersDto(administrerUtilisateurRepo.findAll());
	}
	
	public void deleteAdministrerUtilisateur(AdministrerUtilisateurId id) {
		administrerUtilisateurRepo.deleteById(id);	
	}
	
	public void updateAdministrerUtilisateur(AdministrerUtilisateurDTO au) {
		administrerUtilisateurRepo.save(converter.dtoVersEntity(au));
	}

}
