package fr.cda.tender_du_poulet.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.AdministrerPublicationRepository;
import fr.cda.tender_du_poulet.dto.AdministrerPublicationDTO;
import fr.cda.tender_du_poulet.util.AdministrerPublicationConverter;

@Service
public class AdministrerPublicationService {
	
	private AdministrerPublicationConverter converter = new AdministrerPublicationConverter();
	
	@Autowired
	AdministrerPublicationRepository administrerPublicationRepo;
	
	public void ajoutAdministrerPublication (AdministrerPublicationDTO ap) {
		administrerPublicationRepo.save(converter.dtoVersEntity(ap));	
	}
	
	public AdministrerPublicationDTO recupAdministrerPublication (int id) {
		return converter.entityVersDto(administrerPublicationRepo.findById(id).get());
	}
	
	public List<AdministrerPublicationDTO> recupAllAdministrerPublication() {
		return converter.entityVersDto(administrerPublicationRepo.findAll());
	}

}
