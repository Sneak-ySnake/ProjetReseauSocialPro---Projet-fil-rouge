package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.cda.tender_du_poulet.dao.Utilisateur_ProfilRepository;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilDTO;
import fr.cda.tender_du_poulet.util.Utilisateur_ProfilConverter;

public class Utilisateur_ProfilService {

	private Utilisateur_ProfilConverter converter = new Utilisateur_ProfilConverter();
	
	@Autowired
	Utilisateur_ProfilRepository utilisateur_ProfilRepository;
	
	public void ajoutUtilisateur(Utilisateur_ProfilDTO up) {
		utilisateur_ProfilRepository.save(converter.dtoVersEntity(up));
	}
	
	public Utilisateur_ProfilDTO recupUtilisateur_Profil(int id) {
		return converter.entityVersDto(utilisateur_ProfilRepository.findById(id).get());
	}
	
	public List<Utilisateur_ProfilDTO> recupAllUtilisateur_Profil(int id) {
		return converter.entityVersDto(utilisateur_ProfilRepository.findAll());
	}
}
