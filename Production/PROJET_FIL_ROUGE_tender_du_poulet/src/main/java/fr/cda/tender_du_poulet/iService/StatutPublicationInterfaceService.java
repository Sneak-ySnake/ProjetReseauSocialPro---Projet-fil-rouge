package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.StatutPublicationDTO;

public interface StatutPublicationInterfaceService {

	public void ajoutStatutPublication(StatutPublicationDTO s);
	
	public StatutPublicationDTO recupStatutPublication(int id);
	
	public List<StatutPublicationDTO> recupAllStatutPublication();
	
	public void supprimerStatutPublication(int id);
}
