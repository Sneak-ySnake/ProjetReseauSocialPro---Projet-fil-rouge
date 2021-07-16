package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import fr.cda.tender_du_poulet.beans.ActionSurUtilisateur;
import fr.cda.tender_du_poulet.dto.ActionSurUtilisateurDTO;

@Component
public class ActionSurUtilisateurConverter {
	
	public ActionSurUtilisateurDTO entityVersDto(ActionSurUtilisateur s) {
		ModelMapper mapper = new ModelMapper();
		ActionSurUtilisateurDTO map = mapper.map(s, ActionSurUtilisateurDTO.class);
		return map;
	}
	
	public List<ActionSurUtilisateurDTO> entityVersDto(List<ActionSurUtilisateur> a) {
		return a.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public ActionSurUtilisateur dtoVersEntity(ActionSurUtilisateurDTO a) {
		ModelMapper mapper = new ModelMapper();
		ActionSurUtilisateur map = mapper.map(a, ActionSurUtilisateur.class);
		return map;
	}
	
	public List<ActionSurUtilisateur> dtoVersEntity(List<ActionSurUtilisateurDTO> s) {
		return s.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}

}
