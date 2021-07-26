package fr.cda.tender_du_poulet.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.beans.AdministrerPublication;
import fr.cda.tender_du_poulet.beans.AdministrerPublicationId;
import fr.cda.tender_du_poulet.dao.AdministrerPublicationRepository;
import fr.cda.tender_du_poulet.dao.DomaineRepository;
import fr.cda.tender_du_poulet.dao.EtatPublicationRepository;
import fr.cda.tender_du_poulet.dao.PublicationRepository;
import fr.cda.tender_du_poulet.dao.StatutPublicationRepository;
import fr.cda.tender_du_poulet.dao.TypePublicationRepository;
import fr.cda.tender_du_poulet.dao.UtilisateurRepository;
import fr.cda.tender_du_poulet.dto.AdministrerPublicationDTO;
import fr.cda.tender_du_poulet.iService.AdministrerPublicationInterfaceService;
import fr.cda.tender_du_poulet.util.AdministrerPublicationConverter;

@Service
public class AdministrerPublicationService implements AdministrerPublicationInterfaceService {
	
	private AdministrerPublicationConverter converter = new AdministrerPublicationConverter();
	
	
	@Autowired
	private AdministrerPublicationRepository administrerPublicationRepo;
	
	
	
	public void creerAdministrerPublication (AdministrerPublicationDTO ap) {
		administrerPublicationRepo.save(converter.dtoVersEntity(ap));	
	}
	
	public AdministrerPublicationDTO recupAdministrerPublication (AdministrerPublicationId id) {
		return converter.entityVersDto(administrerPublicationRepo.findById(id).get());
	}
	
	public List<AdministrerPublicationDTO> recupAllAdministrerPublication() {
		return converter.entityVersDto(administrerPublicationRepo.findAll());
	}

	public void deleteAdministrerPublication(AdministrerPublicationId id) {
		administrerPublicationRepo.deleteById(id);	
	}

	public void updateAdministrerPublication(AdministrerPublicationDTO ap) {
		administrerPublicationRepo.save(converter.dtoVersEntity(ap));
		
	}


}
