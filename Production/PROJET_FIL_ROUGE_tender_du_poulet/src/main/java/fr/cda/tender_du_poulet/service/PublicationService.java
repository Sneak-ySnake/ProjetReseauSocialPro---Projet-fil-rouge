package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.PublicationRepository;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.util.PublicationConverter;

@Service
public class PublicationService {

	private PublicationConverter converter = new PublicationConverter();
	
	@Autowired
	PublicationRepository publicationRepository;
	
	public void ajoutPublication(PublicationDTO p) {
		publicationRepository.save(converter.dtoVersEntity(p));
	}
	
	public PublicationDTO recupPublication(int id) {
		return converter.entityVersDto(publicationRepository.findById(id).get());
	}
	
	public List<PublicationDTO> recupAllPublication() {
		return converter.entityVersDto(publicationRepository.findAll());
	}
	
}
