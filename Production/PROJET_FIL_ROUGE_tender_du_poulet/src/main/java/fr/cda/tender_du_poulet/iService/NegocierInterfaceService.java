package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.NegocierId;
import fr.cda.tender_du_poulet.dto.NegocierDTO;
 
 public interface NegocierInterfaceService {
 
	public void addNegocier(NegocierDTO n);  
	
    public NegocierDTO findNegocier(NegocierId id);
	
	public List<NegocierDTO> findAllNegocier(); 
	
	public void deleteNegocier(NegocierId id);
	
	public void updateNegocier(NegocierDTO n);	
  	
}
