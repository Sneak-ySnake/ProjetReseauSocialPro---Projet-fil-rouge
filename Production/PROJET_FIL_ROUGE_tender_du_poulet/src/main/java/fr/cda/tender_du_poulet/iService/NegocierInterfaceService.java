package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.NegocierId;
import fr.cda.tender_du_poulet.dto.NegocierDTO;
 
 public interface NegocierInterfaceService {
 
	public void ajoutNegocier(NegocierDTO n);  
	
    public NegocierDTO recupNegocier(NegocierId id);
	
	public List<NegocierDTO> recupAllNegocier(); 
	
	public void supprimerNegocier(NegocierId id);
	
	public void modifNegocier(NegocierDTO n);	
  	
}
