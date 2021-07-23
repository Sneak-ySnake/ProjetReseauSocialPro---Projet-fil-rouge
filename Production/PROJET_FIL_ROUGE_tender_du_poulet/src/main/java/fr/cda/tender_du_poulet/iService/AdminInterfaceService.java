package fr.cda.tender_du_poulet.iService;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dto.AdminDTO;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;

@Service
public interface AdminInterfaceService {
	
	public void ajoutAdmin (AdminDTO a);
	
	public AdminDTO recupAdmin(int id);
	
	public List<AdminDTO> recupAllAdmin();
	
	public void deleteAdmin (int id);
	
	public void updateAdmin (AdminDTO a);
	
	public List<PublicationDTO> recupAllPublication();
	
	public List<UtilisateurDTO> recupAllUtilisateur();

}
