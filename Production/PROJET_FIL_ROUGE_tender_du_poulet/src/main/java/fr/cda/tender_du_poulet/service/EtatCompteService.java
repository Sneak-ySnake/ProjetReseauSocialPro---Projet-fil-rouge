package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.EtatCompteRepository;
import fr.cda.tender_du_poulet.dto.EtatCompteDTO;
import fr.cda.tender_du_poulet.iService.EtatCompteInterfaceService;
import fr.cda.tender_du_poulet.util.EtatCompteConverter;

@Service
public class EtatCompteService implements EtatCompteInterfaceService {

	private EtatCompteConverter converter = new EtatCompteConverter();
	
	@Autowired
	EtatCompteRepository etatCompteRepository;
	
	public void addEtatCompte(EtatCompteDTO ec) {
		etatCompteRepository.save(converter.dtoVersEntity(ec));
	}
	
	public EtatCompteDTO findEtatCompte(int id) {
		return converter.entityVersDto(etatCompteRepository.findById(id).get());
	}
	
	public List<EtatCompteDTO> findAllEtatCompte() {
		return converter.entityVersDto(etatCompteRepository.findAll());
	}
	
	public void updateEtatCompte(EtatCompteDTO d) {
		etatCompteRepository.save(converter.dtoVersEntity(d));
	}
	
	public void deleteEtatCompte(int id) {
		etatCompteRepository.deleteById(id);
	}
}
