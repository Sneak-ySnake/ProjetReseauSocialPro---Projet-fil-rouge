package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.Utilisateur_EtatCompteRepository;
import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteDTO;
import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteIdDTO;
import fr.cda.tender_du_poulet.iService.Utilisateur_EtatCompteInterfaceService;
import fr.cda.tender_du_poulet.util.Utilisateur_EtatCompteConverter;
import fr.cda.tender_du_poulet.util.Utilisateur_EtatCompteIdConverter;

@Service
public class Utilisateur_EtatCompteService implements Utilisateur_EtatCompteInterfaceService {

	private Utilisateur_EtatCompteConverter converter = new Utilisateur_EtatCompteConverter();
	
	private Utilisateur_EtatCompteIdConverter converterId = new Utilisateur_EtatCompteIdConverter();
	
	@Autowired
	Utilisateur_EtatCompteRepository utilisateur_EtatCompteRepository;
	
	public void addUtilisateur_EtatCompte(Utilisateur_EtatCompteDTO uec) {
		utilisateur_EtatCompteRepository.save(converter.dtoVersEntity(uec));
	}
	
	public Utilisateur_EtatCompteDTO findUtilisateur_EtatCompte(Utilisateur_EtatCompteIdDTO id) {
		return converter.entityVersDto(utilisateur_EtatCompteRepository.findById(converterId.dtoVersEntity(id)).get());
	}
	
	public List<Utilisateur_EtatCompteDTO> findAllUtilisateur_EtatCompte() {
		return converter.entityVersDto(utilisateur_EtatCompteRepository.findAll());
	}
	
	public void updateUtilisateur_EtatCompte(Utilisateur_EtatCompteDTO d) {
		utilisateur_EtatCompteRepository.save(converter.dtoVersEntity(d));
	}
	
	public void deleteUtilisateur_EtatCompte(Utilisateur_EtatCompteIdDTO id) {
		utilisateur_EtatCompteRepository.deleteById(converterId.dtoVersEntity(id));
	}
}
