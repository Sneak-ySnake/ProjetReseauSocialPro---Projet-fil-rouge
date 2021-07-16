package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.ActionSurPublication;
import fr.cda.tender_du_poulet.dto.ActionSurPublicationDTO;


@Component
public class ActionSurPublicationConverter {
	
	public ActionSurPublicationDTO entityVersDto(ActionSurPublication s) {
		ModelMapper mapper = new ModelMapper();
		ActionSurPublicationDTO map = mapper.map(s, ActionSurPublicationDTO.class);
		return map;
	}
	
	public List<ActionSurPublicationDTO> entityVersDto(List<ActionSurPublication> a) {
		return a.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public ActionSurPublication dtoVersEntity(ActionSurPublicationDTO a) {
		ModelMapper mapper = new ModelMapper();
		ActionSurPublication map = mapper.map(a, ActionSurPublication.class);
		return map;
	}
	
	public List<ActionSurPublication> dtoVersEntity(List<ActionSurPublicationDTO> s) {
		return s.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
}
