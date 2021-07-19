package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.AccesPublicationId;
import fr.cda.tender_du_poulet.dto.AccesPublicationDTO;

public interface AccesPublicationInterfaceService {

	public void ajoutAccesPublication(AccesPublicationDTO a);
	
	public AccesPublicationDTO recupAccesPublication(AccesPublicationId id);
	
	public List<AccesPublicationDTO> recupAllAccesPublication();
	
}
