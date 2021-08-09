package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.UtilisateurRepository;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;
import fr.cda.tender_du_poulet.util.UtilisateurConverter;

@Service
public class UtilisateurService {

	private UtilisateurConverter converter = new UtilisateurConverter();
	
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	public void addUtilisateur(UtilisateurDTO u) {
		utilisateurRepository.save(converter.dtoVersEntity(u));
	}
	
	public UtilisateurDTO findUtilisateur(int id) {
		return converter.entityVersDto(utilisateurRepository.findById(id).get());
	}
	
	public List<UtilisateurDTO> findAllUtilisateur() {
		return converter.entityVersDto(utilisateurRepository.findAll());
	}

	public void updateUtilisateur(UtilisateurDTO u) {
		utilisateurRepository.save(converter.dtoVersEntity(u));
	}
	
	public void deleteUtilisateur(int id) {
		utilisateurRepository.deleteById(id);
	}
	
	public UtilisateurDTO findUtilisateurEmail(String email_utilisateur) {
		return converter.entityVersDto(utilisateurRepository.findByEmail(email_utilisateur));
	}
	
}
