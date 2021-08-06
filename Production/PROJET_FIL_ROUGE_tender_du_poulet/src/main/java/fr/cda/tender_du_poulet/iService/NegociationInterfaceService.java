package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.NegociationDTO;

 public interface NegociationInterfaceService {
 
	public void addNegociation(NegociationDTO n);  
	
	public NegociationDTO findNegociation(int id);
	
	public List<NegociationDTO> findAllNegociation(); 
	
	public void deleteNegociation(int id);
	
	public void updateNegociation(NegociationDTO p);
}
