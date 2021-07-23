package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.beans.Utilisateur_EtatCompteId;
import fr.cda.tender_du_poulet.dao.Utilisateur_EtatCompteRepository;
import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteDTO;
import fr.cda.tender_du_poulet.iService.Utilisateur_EtatCompteInterfaceService;
import fr.cda.tender_du_poulet.util.Utilisateur_EtatCompteConverter;

@Service
public class Utilisateur_EtatCompteService implements Utilisateur_EtatCompteInterfaceService {

	private Utilisateur_EtatCompteConverter converter = new Utilisateur_EtatCompteConverter();
	
	@Autowired
	Utilisateur_EtatCompteRepository utilisateur_EtatCompteRepository;
	
	public void ajoutUtilisateur_EtatCompte(Utilisateur_EtatCompteDTO uec) {
		utilisateur_EtatCompteRepository.save(converter.dtoVersEntity(uec));
	}
	
	public Utilisateur_EtatCompteDTO recupUtilisateur_EtatCompte(Utilisateur_EtatCompteId id) {
		return converter.entityVersDto(utilisateur_EtatCompteRepository.findById(id).get());
	}
	
	public List<Utilisateur_EtatCompteDTO> recupAllUtilisateur_EtatCompte() {
		return converter.entityVersDto(utilisateur_EtatCompteRepository.findAll());
	}
	
	public void modifUtilisateur_EtatCompte(Utilisateur_EtatCompteDTO d) {
		utilisateur_EtatCompteRepository.save(converter.dtoVersEntity(d));
	}
	
	public void supprimerUtilisateur_EtatCompte(Utilisateur_EtatCompteId id) {
		utilisateur_EtatCompteRepository.deleteById(id);
	}
}
