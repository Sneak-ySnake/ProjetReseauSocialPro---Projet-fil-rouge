package fr.cda.tender_du_poulet.iService;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dto.ActionSurUtilisateurDTO;

@Service
public interface ActionSurUtilisateurInterfaceService {
	
	public void ajoutActionSurUtilisateur (ActionSurUtilisateurDTO au);
	
	public ActionSurUtilisateurDTO recupActionSurUtilisateur (int id);
	
	public List<ActionSurUtilisateurDTO> recupAllActionSurUtilisateur();
	
	public void deleteActionSurUtilisateur (int id);
	
	public void updateActionSurUtilisateur (ActionSurUtilisateurDTO au);
}
