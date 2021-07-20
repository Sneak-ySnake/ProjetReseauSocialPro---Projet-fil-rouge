package fr.cda.tender_du_poulet.iService;

import java.util.List;
import fr.cda.tender_du_poulet.dto.AdministrerUtilisateurDTO;

public interface AdministrerUtilisateurInterfaceService {
	
	public void ajoutAdministrerUtilisateur (AdministrerUtilisateurDTO ap);	
	
	public AdministrerUtilisateurDTO recupAdministrerUtilisateur (int id);
	
	public List<AdministrerUtilisateurDTO> recupAllAdministrerUtilisateur(int id);

}
