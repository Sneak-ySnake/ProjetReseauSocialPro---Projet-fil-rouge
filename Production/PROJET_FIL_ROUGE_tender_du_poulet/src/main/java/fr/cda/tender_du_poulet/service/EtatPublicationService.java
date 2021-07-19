package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.EtatPublicationRepository;
import fr.cda.tender_du_poulet.dto.EtatPublicationDTO;
import fr.cda.tender_du_poulet.util.EtatPublicationConverter;

@Service
public class EtatPublicationService {

	EtatPublicationConverter converter = new EtatPublicationConverter();
	
	@Autowired
	private EtatPublicationRepository etatPublicationRepository;
	
	public void ajoutEtatPublication(EtatPublicationDTO e) {
		etatPublicationRepository.save(converter.dtoVersEntity(e));
	}
	
	public EtatPublicationDTO recupEtatPublication(int id) {
		return converter.entityVersDto(etatPublicationRepository.findById(id).get());
	}
	
	public List<EtatPublicationDTO> recupAllEtatPublication() {
		return converter.entityVersDto(etatPublicationRepository.findAll());
	}
	
}
