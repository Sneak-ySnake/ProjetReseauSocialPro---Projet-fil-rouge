package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.EtatPublicationRepository;
import fr.cda.tender_du_poulet.dto.EtatPublicationDTO;
import fr.cda.tender_du_poulet.iService.EtatPublicationInterfaceService;
import fr.cda.tender_du_poulet.util.EtatPublicationConverter;

@Service
public class EtatPublicationService implements EtatPublicationInterfaceService {

	EtatPublicationConverter converter = new EtatPublicationConverter();
	
	@Autowired
	private EtatPublicationRepository etatPublicationRepository;
	
	public void addEtatPublication(EtatPublicationDTO e) {
		etatPublicationRepository.save(converter.dtoVersEntity(e));
	}
	
	public EtatPublicationDTO findEtatPublication(int id) {
		return converter.entityVersDto(etatPublicationRepository.findById(id).get());
	}
	
	public List<EtatPublicationDTO> findAllEtatPublication() {
		return converter.entityVersDto(etatPublicationRepository.findAll());
	}
	
	public void deleteEtatPublication(int id) {
		etatPublicationRepository.deleteById(id);
	}
	
	public void updateEtatPublication(EtatPublicationDTO e) {
		etatPublicationRepository.save(converter.dtoVersEntity(e));
	}
	
}
