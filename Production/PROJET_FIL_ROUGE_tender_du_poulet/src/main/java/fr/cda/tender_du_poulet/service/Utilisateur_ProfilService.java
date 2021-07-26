package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.beans.Utilisateur_ProfilId;
import fr.cda.tender_du_poulet.dao.Utilisateur_ProfilRepository;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilDTO;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilIdDTO;
import fr.cda.tender_du_poulet.util.Utilisateur_ProfilConverter;
import fr.cda.tender_du_poulet.util.Utilisateur_ProfilIdConverter;

@Service
public class Utilisateur_ProfilService {

	private Utilisateur_ProfilConverter converter = new Utilisateur_ProfilConverter();
	
	private Utilisateur_ProfilIdConverter converterId = new Utilisateur_ProfilIdConverter();
	
	@Autowired
	Utilisateur_ProfilRepository utilisateur_ProfilRepository;

	public void ajoutUtilisateur_Profil(Utilisateur_ProfilDTO uec) {
		utilisateur_ProfilRepository.save(converter.dtoVersEntity(uec));
	}
	
	public Utilisateur_ProfilDTO recupUtilisateur_Profil0(Utilisateur_ProfilId id) {
		return converter.entityVersDto(utilisateur_ProfilRepository.findById(id).get());
	}

	public Utilisateur_ProfilDTO recupUtilisateur_Profil(Utilisateur_ProfilIdDTO id) {
		return converter.entityVersDto(utilisateur_ProfilRepository.findById(converterId.dtoVersEntity(id)).get());
	}
	
	public List<Utilisateur_ProfilDTO> recupAllUtilisateur_Profil() {
		return converter.entityVersDto(utilisateur_ProfilRepository.findAll());
	}
	
	public void modifUtilisateur_Profil(Utilisateur_ProfilDTO d) {
		utilisateur_ProfilRepository.save(converter.dtoVersEntity(d));
	}
	
	public void supprimerUtilisateur_Profil(Utilisateur_ProfilId id) {
		utilisateur_ProfilRepository.deleteById(id);
	}
}
