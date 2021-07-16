package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.cda.tender_du_poulet.dao.EtatCompteRepository;
import fr.cda.tender_du_poulet.dto.EtatCompteDTO;
import fr.cda.tender_du_poulet.util.EtatCompteConverter;

public class EtatCompteService {

	private EtatCompteConverter converter = new EtatCompteConverter();
	
	@Autowired
	EtatCompteRepository etatCompteRepository;
	
	public void ajoutEtatCompte(EtatCompteDTO ec) {
		etatCompteRepository.save(converter.dtoVersEntity(ec));
	}
	
	public EtatCompteDTO recupEtatCompte(int id) {
		return converter.entityVersDto(etatCompteRepository.findById(id).get());
	}
	
	public List<EtatCompteDTO> recupAllEtatCompte(int id) {
		return converter.entityVersDto(etatCompteRepository.findAll());
	}
}
