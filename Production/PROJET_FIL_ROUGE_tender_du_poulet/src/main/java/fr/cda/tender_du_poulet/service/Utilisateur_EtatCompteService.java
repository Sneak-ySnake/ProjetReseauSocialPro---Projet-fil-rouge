package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.cda.tender_du_poulet.dao.Utilisateur_EtatCompteRepository;
import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteDTO;
import fr.cda.tender_du_poulet.util.Utilisateur_EtatCompteConverter;

public class Utilisateur_EtatCompteService {

	private Utilisateur_EtatCompteConverter converter = new Utilisateur_EtatCompteConverter();
	
	@Autowired
	Utilisateur_EtatCompteRepository utilisateur_EtatCompteRepository;
	
	public void ajoutUtilisateur(Utilisateur_EtatCompteDTO uec) {
		utilisateur_EtatCompteRepository.save(converter.dtoVersEntity(uec));
	}
	
	public Utilisateur_EtatCompteDTO recupUtilisateur(int id) {
		return converter.entityVersDto(utilisateur_EtatCompteRepository.findById(id).get());
	}
	
	public List<Utilisateur_EtatCompteDTO> recupAllUtilisateur(int id) {
		return converter.entityVersDto(utilisateur_EtatCompteRepository.findAll());
	}
}
