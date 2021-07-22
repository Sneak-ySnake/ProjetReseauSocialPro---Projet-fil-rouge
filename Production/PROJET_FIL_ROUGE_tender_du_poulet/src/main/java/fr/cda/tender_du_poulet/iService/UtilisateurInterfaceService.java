package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.UtilisateurDTO;

public interface UtilisateurInterfaceService {


	public void ajoutUtilisateur(UtilisateurDTO u);
	
	public UtilisateurDTO recupUtilisateur(int id);
	
	public List<UtilisateurDTO> recupAllUtilisateur();
	
	public void modifUtilisateur(UtilisateurDTO u);
	
	public void supprimerUtilisateur(int id);
}
