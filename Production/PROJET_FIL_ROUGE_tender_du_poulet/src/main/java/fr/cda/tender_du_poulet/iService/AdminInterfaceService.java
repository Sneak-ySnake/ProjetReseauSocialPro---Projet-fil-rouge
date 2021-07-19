package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.AdminDTO;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;

public interface AdminInterfaceService {
	
	public void ajoutAdmin (AdminDTO a);
	
	public AdminDTO recupAdmin(int id);
	
	public List<PublicationDTO> recupAllPublication(int id);
	
	public List<UtilisateurDTO> recupAllUtilisateur(int id);

}
