package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.PublicationRepository;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.iService.PublicationInterfaceService;
import fr.cda.tender_du_poulet.util.PublicationConverter;

@Service
public class PublicationService implements PublicationInterfaceService {

	private PublicationConverter converter = new PublicationConverter();
	
	@Autowired
	PublicationRepository publicationRepository;
	
	public void addPublication(PublicationDTO p) {
		publicationRepository.save(converter.dtoVersEntity(p));
	}
	
	public PublicationDTO findPublication(int id) {
		return converter.entityVersDto(publicationRepository.findById(id).get());
	}
	
	public List<PublicationDTO> findAllPublication() {
		return converter.entityVersDto(publicationRepository.findAll());
	}
	
	public void deletePublication(int id) {
		publicationRepository.deleteById(id);
	}
	
	public void updatePublication(PublicationDTO p) {
		publicationRepository.save(converter.dtoVersEntity(p));
	}
	
}
