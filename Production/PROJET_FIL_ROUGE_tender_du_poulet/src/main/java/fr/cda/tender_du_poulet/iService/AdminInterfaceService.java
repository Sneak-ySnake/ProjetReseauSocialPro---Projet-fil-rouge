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
	
	public void UpdateAdmin (AdminDTO a);
	
	public void deleteAdmin (AdminDTO a);
	
	public List<PublicationDTO> recupAllPublication(int id);
	
	public List<UtilisateurDTO> recupAllUtilisateur(int id);

}
