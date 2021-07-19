package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.NegociationDTO;

 public interface NegociationInterfaceService {
 
	public void ajoutNegociation(NegociationDTO n);  
	
	public NegociationDTO recupNegociation(int id);
	
	public List<NegociationDTO> recupAllNegociation(); 
	
}
