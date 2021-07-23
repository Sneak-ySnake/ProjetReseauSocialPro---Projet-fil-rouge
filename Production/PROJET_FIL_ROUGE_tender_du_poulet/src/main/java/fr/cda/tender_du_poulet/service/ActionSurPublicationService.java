package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.ActionSurPublicationRepository;
import fr.cda.tender_du_poulet.dto.ActionSurPublicationDTO;
import fr.cda.tender_du_poulet.iService.ActionSurPublicationInterfaceService;
import fr.cda.tender_du_poulet.util.ActionSurPublicationConverter;

@Service
public class ActionSurPublicationService implements ActionSurPublicationInterfaceService {
	
	private ActionSurPublicationConverter converter = new ActionSurPublicationConverter();
	
	@Autowired
	ActionSurPublicationRepository actionSurPublicationRepo;
	
	public void ajoutActionSurPublication(ActionSurPublicationDTO ap) {
		actionSurPublicationRepo.save(converter.dtoVersEntity(ap));
	}
	
	public ActionSurPublicationDTO recupActionSurPublication(int id) {
		return converter.entityVersDto(actionSurPublicationRepo.findById(id).get());
	}
	
	public List<ActionSurPublicationDTO> recupAllActionSurPublication() {
		return converter.entityVersDto(actionSurPublicationRepo.findAll());
	}
	
	public void deleteActionSurPublication (int id) {
		actionSurPublicationRepo.deleteById(id);
	}
	
	public void updateActionSurPublication (ActionSurPublicationDTO ap) {
		actionSurPublicationRepo.save(converter.dtoVersEntity(ap));
	}
	
	
	
	

}
