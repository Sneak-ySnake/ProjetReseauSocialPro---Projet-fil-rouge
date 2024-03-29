package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.beans.AccesPublicationId;
import fr.cda.tender_du_poulet.dao.AccesPublicationRepository;
import fr.cda.tender_du_poulet.dto.AccesPublicationDTO;
import fr.cda.tender_du_poulet.dto.AccesPublicationIdDTO;
import fr.cda.tender_du_poulet.iService.AccesPublicationInterfaceService;
import fr.cda.tender_du_poulet.util.AccesPublicationConverter;
import fr.cda.tender_du_poulet.util.AccesPublicationIdConverter;

@Service
public class AccesPublicationService implements AccesPublicationInterfaceService {

	private AccesPublicationConverter converterAccesPublication = new AccesPublicationConverter();
	
	private AccesPublicationIdConverter converterAccesPublicationId = new AccesPublicationIdConverter();
	
	@Autowired
	AccesPublicationRepository accesPublicationRepository;
	
	public void addAccesPublication(AccesPublicationDTO a) {
		accesPublicationRepository.save(converterAccesPublication.dtoVersEntity(a));
	}
	
	public AccesPublicationDTO findAccesPublication(AccesPublicationIdDTO id) {
		AccesPublicationId idEntity = converterAccesPublicationId.dtoVersEntity(id);
		return converterAccesPublication.entityVersDto(accesPublicationRepository.findById(idEntity).get());
	}
	
	public List<AccesPublicationDTO> findAllAccesPublication() {
		return converterAccesPublication.entityVersDto(accesPublicationRepository.findAll());
	}
	
	public void deleteAccesPublication(AccesPublicationIdDTO id) {
		AccesPublicationId idEntity = converterAccesPublicationId.dtoVersEntity(id);
		accesPublicationRepository.deleteById(idEntity);
	}
	
	public void updateAccesPublication(AccesPublicationDTO a) {
		accesPublicationRepository.save(converterAccesPublication.dtoVersEntity(a));
	}
	
}
