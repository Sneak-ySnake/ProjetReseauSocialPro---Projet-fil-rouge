package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.AdministrerUtilisateurId;
import fr.cda.tender_du_poulet.dto.AdministrerUtilisateurDTO;

public interface AdministrerUtilisateurInterfaceService {
	
	public void addAdministrerUtilisateur (AdministrerUtilisateurDTO ap);	
	
	public AdministrerUtilisateurDTO findAdministrerUtilisateur (AdministrerUtilisateurId id);
	
	public List<AdministrerUtilisateurDTO> findAllAdministrerUtilisateur();
	
	public void deleteAdministrerUtilisateur(AdministrerUtilisateurId id);
	
	public void updateAdministrerUtilisateur(AdministrerUtilisateurDTO au);

}
