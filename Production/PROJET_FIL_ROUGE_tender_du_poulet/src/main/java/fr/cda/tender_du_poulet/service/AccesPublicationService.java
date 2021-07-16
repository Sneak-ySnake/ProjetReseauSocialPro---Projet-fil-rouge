package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.beans.AccesPublicationId;
import fr.cda.tender_du_poulet.dao.AccesPublicationRepository;
import fr.cda.tender_du_poulet.dto.AccesPublicationDTO;
import fr.cda.tender_du_poulet.util.AccesPublicationConverter;

@Service
public class AccesPublicationService {

	private AccesPublicationConverter converter;
	
	@Autowired
	AccesPublicationRepository accesPublicationRepository;
	
	public void ajoutAccesPublication(AccesPublicationDTO a) {
		accesPublicationRepository.save(converter.dtoVersEntity(a));
	}
	
	public AccesPublicationDTO recupAccesPublication(AccesPublicationId id) {
		return converter.entityVersDto(accesPublicationRepository.findById(id).get());
	}
	
	public List<AccesPublicationDTO> recupAllAccesPublication() {
		return converter.entityVersDto(accesPublicationRepository.findAll());
	}
	
}