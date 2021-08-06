package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.StatutPublicationDTO;

public interface StatutPublicationInterfaceService {

	public void addStatutPublication(StatutPublicationDTO s);
	
	public StatutPublicationDTO findStatutPublication(int id);
	
	public List<StatutPublicationDTO> findAllStatutPublication();
	
	public void deleteStatutPublication(int id);
	
	public void updateStatutPublication(StatutPublicationDTO s);
}
