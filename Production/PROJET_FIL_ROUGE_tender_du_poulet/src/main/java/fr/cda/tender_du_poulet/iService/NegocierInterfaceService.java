package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.NegocierDTO;

 public interface NegocierInterfaceService {
 
	public void ajoutNegocier(NegocierDTO n);  
	
	public NegocierDTO recupNegocier(int id);
	
	public List<NegocierDTO> recupAllNegocier(); 
	
}
