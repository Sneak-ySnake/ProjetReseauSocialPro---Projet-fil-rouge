package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.ActionSurPublicationDTO;

public interface ActionSurPublicationInterfaceService  {
	
	public void ajoutActionSurPublication(ActionSurPublicationDTO au);
	
	public ActionSurPublicationDTO recupActionSurPublication(int id);
	
	public List<ActionSurPublicationDTO> recupAllActionSurPublication();

}
