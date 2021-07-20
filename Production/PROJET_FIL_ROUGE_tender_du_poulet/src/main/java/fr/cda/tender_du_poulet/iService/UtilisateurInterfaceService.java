package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.UtilisateurDTO;

public interface UtilisateurInterfaceService {


	public void ajoutUtilisateur(UtilisateurDTO t);
	
	public UtilisateurDTO recupUtilisateur(int id);
	
	public List<UtilisateurDTO> recupAllUtilisateur();
	
}
