package fr.cda.tender_du_poulet.iService;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dto.AdminDTO;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;

@Service
public interface AdminInterfaceService {
	
	public void addAdmin (AdminDTO a);
	
	public AdminDTO findAdmin(int id);
	
	public List<AdminDTO> findAllAdmin();
	
	public void deleteAdmin (int id);
	
	public void updateAdmin (AdminDTO a);
	
	public List<PublicationDTO> findAllPublication();
	
	public List<UtilisateurDTO> findAllUtilisateur();

}
