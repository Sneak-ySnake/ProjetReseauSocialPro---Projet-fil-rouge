package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.AccesPublication;
import fr.cda.tender_du_poulet.beans.AccesPublicationId;
import fr.cda.tender_du_poulet.dto.AccesPublicationDTO;
import fr.cda.tender_du_poulet.dto.AccesPublicationIdDTO;

@Component
public class AccesPublicationIdConverter {
	
	public AccesPublicationDTO entityVersDto(AccesPublicationId x) {
		ModelMapper mapper = new ModelMapper();
		AccesPublicationDTO map = mapper.map(x, AccesPublicationDTO.class);
		return map;
	}
	
	public List<AccesPublicationDTO> entityVersDto(List<AccesPublicationId> a) {
		return a.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public AccesPublication dtoVersEntity(AccesPublicationIdDTO a) {
		ModelMapper mapper = new ModelMapper();
		AccesPublication map = mapper.map(a, AccesPublication.class);
		return map;
	}
	
	public List<AccesPublication> dtoVersEntity(List<AccesPublicationIdDTO> a) {
		return a.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
	
}
