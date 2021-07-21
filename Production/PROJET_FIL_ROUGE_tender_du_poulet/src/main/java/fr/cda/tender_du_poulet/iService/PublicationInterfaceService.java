package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.PublicationDTO;

public interface PublicationInterfaceService {

	public void ajoutPublication(PublicationDTO p);
	
	public PublicationDTO recupPublication(int id);
	
	public List<PublicationDTO> recupAllPublication();

	public void supprimerPublication(int id);
}
