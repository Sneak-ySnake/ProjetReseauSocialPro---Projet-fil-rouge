package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.TypePublicationRepository;
import fr.cda.tender_du_poulet.dto.TypePublicationDTO;
import fr.cda.tender_du_poulet.util.TypePublicationConverter;

@Service
public class TypePublicationService {

	TypePublicationConverter converter = new TypePublicationConverter();
	
	@Autowired
	TypePublicationRepository typePublicationRepository;
	
	public void ajoutTypePublication(TypePublicationDTO t) {
		typePublicationRepository.save(converter.dtoVersEntity(t));
	}
	
	public TypePublicationDTO recupTypePublication(int id) {
		return converter.entityVersDto(typePublicationRepository.findById(id).get());
	}
	
	public List<TypePublicationDTO> recupAllTypePublication() {
		return converter.entityVersDto(typePublicationRepository.findAll());
	}
	
}
