package fr.cda.tender_du_poulet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.AccesPublicationRepository;
import fr.cda.tender_du_poulet.dto.AccesPublicationIdDTO;
import fr.cda.tender_du_poulet.util.AccesPublicationIdConverter;

@Service
public class AccesPublicationIdService {

	private AccesPublicationIdConverter converter = new AccesPublicationIdConverter();
	
	@Autowired
	AccesPublicationRepository accesPublicationRepository;
	
	public void ajoutAccesPublicationId(AccesPublicationIdDTO a) {
		accesPublicationRepository.save(converter.dtoVersEntity(a));
	}

}
