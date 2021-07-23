package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.AdministrerUtilisateurId;
import fr.cda.tender_du_poulet.dto.AdministrerUtilisateurDTO;

public interface AdministrerUtilisateurInterfaceService {
	
	public void ajoutAdministrerUtilisateur (AdministrerUtilisateurDTO ap);	
	
	public AdministrerUtilisateurDTO recupAdministrerUtilisateur (AdministrerUtilisateurId id);
	
	public List<AdministrerUtilisateurDTO> recupAllAdministrerUtilisateur();
	
	public void deleteAdministrerUtilisateur(AdministrerUtilisateurId id);
	
	public void updateAdministrerUtilisateur(AdministrerUtilisateurDTO au);

}
