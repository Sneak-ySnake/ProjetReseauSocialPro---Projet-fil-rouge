package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.StatutPublicationRepository;
import fr.cda.tender_du_poulet.dto.StatutPublicationDTO;
import fr.cda.tender_du_poulet.iService.StatutPublicationInterfaceService;
import fr.cda.tender_du_poulet.util.StatutPublicationConverter;

@Service
public class StatutPublicationService implements StatutPublicationInterfaceService {

	private StatutPublicationConverter converter = new StatutPublicationConverter();
	
	@Autowired
	StatutPublicationRepository statutPublicationRepository;
	
	public void ajoutStatutPublication(StatutPublicationDTO s) {
		statutPublicationRepository.save(converter.dtoVersEntity(s));
	}
	
	public StatutPublicationDTO recupStatutPublication(int id) {
		return converter.entityVersDto(statutPublicationRepository.findById(id).get());
	}
	
	public List<StatutPublicationDTO> recupAllStatutPublication() {
		return converter.entityVersDto(statutPublicationRepository.findAll());
	}
	
	public void supprimerStatutPublication(int id) {
		statutPublicationRepository.deleteById(id);
	}
	
	public void modifStatutPublication(StatutPublicationDTO s) {
		statutPublicationRepository.save(converter.dtoVersEntity(s));
	}
}
