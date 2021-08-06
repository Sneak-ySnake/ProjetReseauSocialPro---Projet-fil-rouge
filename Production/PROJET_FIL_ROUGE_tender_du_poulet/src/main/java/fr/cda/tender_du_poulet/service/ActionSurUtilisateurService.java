package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.ActionSurUtilisateurRepository;
import fr.cda.tender_du_poulet.dto.ActionSurUtilisateurDTO;
import fr.cda.tender_du_poulet.iService.ActionSurUtilisateurInterfaceService;
import fr.cda.tender_du_poulet.util.ActionSurUtilisateurConverter;

@Service
public class ActionSurUtilisateurService implements ActionSurUtilisateurInterfaceService{
	
	private ActionSurUtilisateurConverter converter = new ActionSurUtilisateurConverter();
	
	@Autowired
	ActionSurUtilisateurRepository actionSurUtilisateurRepo;
	
	public void addActionSurUtilisateur (ActionSurUtilisateurDTO au) {
		actionSurUtilisateurRepo.save(converter.dtoVersEntity(au));
	}
	
	public ActionSurUtilisateurDTO findActionSurUtilisateur(int id) {
		return converter.entityVersDto(actionSurUtilisateurRepo.findById(id).get());
	}
	
	public List<ActionSurUtilisateurDTO> findAllActionSurUtilisateur() {
		return converter.entityVersDto(actionSurUtilisateurRepo.findAll());
	}

	
	public void deleteActionSurUtilisateur(int id) {
		actionSurUtilisateurRepo.deleteById(id);
		
	}


	public void updateActionSurUtilisateur(ActionSurUtilisateurDTO au) {
		actionSurUtilisateurRepo.save(converter.dtoVersEntity(au));
		
	}

}
