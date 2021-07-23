package fr.cda.tender_du_poulet.iService;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dto.ActionSurPublicationDTO;

@Service
public interface ActionSurPublicationInterfaceService  {
	
	public void ajoutActionSurPublication(ActionSurPublicationDTO ap);
	
	public ActionSurPublicationDTO recupActionSurPublication(int id);
	
	public List<ActionSurPublicationDTO> recupAllActionSurPublication();
	
	public void deleteActionSurPublication (int id);
	
	public void updateActionSurPublication (ActionSurPublicationDTO a);

}
