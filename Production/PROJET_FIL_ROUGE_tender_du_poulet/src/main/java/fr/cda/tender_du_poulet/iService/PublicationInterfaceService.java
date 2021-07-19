package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.PublicationDTO;

public interface PublicationInterfaceService {

	public void ajouterPublication();
	
	public PublicationDTO recupPublication(int id);
	
	public List<PublicationDTO> recupAllPublication();
	
}
