package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.AccesPublicationId;
import fr.cda.tender_du_poulet.dto.AccesPublicationDTO;
import fr.cda.tender_du_poulet.dto.AccesPublicationIdDTO;

public interface AccesPublicationInterfaceService {

	public void ajoutAccesPublication(AccesPublicationDTO a);
	
	public AccesPublicationDTO recupAccesPublication(AccesPublicationIdDTO id);
	
	public List<AccesPublicationDTO> recupAllAccesPublication();
	
	public void supprimerAccesPublication(AccesPublicationId id);
	
	public void modifAccesPublication(AccesPublicationDTO a);
}
