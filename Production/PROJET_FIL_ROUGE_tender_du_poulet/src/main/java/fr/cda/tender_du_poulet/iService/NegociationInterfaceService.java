package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.NegociationDTO;

 public interface NegociationInterfaceService {
 
	public void ajoutNegociation();  
	
	public NegociationDTO recupNegociation();
	
	public List<NegociationDTO> recupAllNegociation(); 
	
}
