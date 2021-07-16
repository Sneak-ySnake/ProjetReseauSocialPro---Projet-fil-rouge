package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.ActionSurUtilisateurRepository;
import fr.cda.tender_du_poulet.dto.ActionSurUtilisateurDTO;
import fr.cda.tender_du_poulet.util.ActionSurUtilisateurConverter;

@Service
public class ActionSurUtilisateurService {
	
	private ActionSurUtilisateurConverter converter = new ActionSurUtilisateurConverter();
	
	@Autowired
	ActionSurUtilisateurRepository actionSurUtilisateurRepo;
	
	public void ajoutActionSurUtilisateur (ActionSurUtilisateurDTO au) {
		actionSurUtilisateurRepo.save(converter.dtoVersEntity(au));
	}
	
	public ActionSurUtilisateurDTO recupActionSurUtilisateur(int id) {
		return converter.entityVersDto(actionSurUtilisateurRepo.findById(id).get());
	}
	
	public List<ActionSurUtilisateurDTO> recupAllActionSurUtilisateur() {
		return converter.entityVersDto(actionSurUtilisateurRepo.findAll());
	}
	
	

}
