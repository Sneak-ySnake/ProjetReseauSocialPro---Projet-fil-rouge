package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.AccesPublicationDTO;
import fr.cda.tender_du_poulet.dto.AccesPublicationIdDTO;

public interface AccesPublicationInterfaceService {

	public void addAccesPublication(AccesPublicationDTO a);
	
	public AccesPublicationDTO findAccesPublication(AccesPublicationIdDTO id);
	
	public List<AccesPublicationDTO> findAllAccesPublication();
	
	public void deleteAccesPublication(AccesPublicationIdDTO id);
	
	public void updateAccesPublication(AccesPublicationDTO a);
}
