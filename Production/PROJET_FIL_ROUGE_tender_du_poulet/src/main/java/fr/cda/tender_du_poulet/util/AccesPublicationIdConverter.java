package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.AccesPublication;
import fr.cda.tender_du_poulet.dto.AccesPublicationDTO;

@Component
public class AccesPublicationIdConverter {
	
	public AccesPublicationDTO entityVersDto(AccesPublication a) {
		ModelMapper mapper = new ModelMapper();
		AccesPublicationDTO map = mapper.map(a, AccesPublicationDTO.class);
		return map;
	}
	
	public List<AccesPublicationDTO> entityVersDto(List<AccesPublication> a) {
		return a.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public AccesPublication dtoVersEntity(AccesPublicationDTO a) {
		ModelMapper mapper = new ModelMapper();
		AccesPublication map = mapper.map(a, AccesPublication.class);
		return map;
	}
	
	public List<AccesPublication> dtoVersEntity(List<AccesPublicationDTO> a) {
		return a.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
	
}
