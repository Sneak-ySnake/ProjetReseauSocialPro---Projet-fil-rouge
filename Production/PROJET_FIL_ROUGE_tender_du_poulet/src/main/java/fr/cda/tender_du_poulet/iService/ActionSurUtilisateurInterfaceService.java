package fr.cda.tender_du_poulet.iService;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dto.ActionSurUtilisateurDTO;

@Service
public interface ActionSurUtilisateurInterfaceService {
	
	public void addActionSurUtilisateur (ActionSurUtilisateurDTO au);
	
	public ActionSurUtilisateurDTO findActionSurUtilisateur (int id);
	
	public List<ActionSurUtilisateurDTO> findAllActionSurUtilisateur();
	
	public void deleteActionSurUtilisateur (int id);
	
	public void updateActionSurUtilisateur (ActionSurUtilisateurDTO au);
}
