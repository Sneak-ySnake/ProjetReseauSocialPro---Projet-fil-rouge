package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.StatutPublication;
import fr.cda.tender_du_poulet.dto.StatutPublicationDTO;

@Component
public class StatutPublicationConverter {

	public StatutPublicationDTO entityVersDto(StatutPublicationDTO s) {
		ModelMapper mapper = new ModelMapper();
		StatutPublicationDTO map = mapper.map(s, StatutPublicationDTO.class);
		return map;
	}
	
	public List<StatutPublicationDTO> entityVersDto(List<StatutPublicationDTO> s) {
		return s.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public StatutPublication dtoVersEntity(StatutPublicationDTO s) {
		ModelMapper mapper = new ModelMapper();
		StatutPublication map = mapper.map(s, StatutPublication.class);
		return map;
	}
	
	public List<StatutPublication> dtoVersEntity(List<StatutPublicationDTO> s) {
		return s.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
	
}
