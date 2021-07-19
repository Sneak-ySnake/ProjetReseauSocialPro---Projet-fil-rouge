package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.ActionSurUtilisateurDTO;

public interface ActionSurUtilisateurInterfaceService {
	
	public void ajoutActionSurUtilisateur (ActionSurUtilisateurDTO au);
	
	public ActionSurUtilisateurDTO recupActionSurUtilisateur (int id);
	
	public List<ActionSurUtilisateurDTO> recupAllActionSurUtilisateur();
}
