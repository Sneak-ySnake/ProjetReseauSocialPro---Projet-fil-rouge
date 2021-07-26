package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.AccesPublicationId;
import fr.cda.tender_du_poulet.dto.AccesPublicationIdDTO;

@Component
public class AccesPublicationIdConverter {
	
	public AccesPublicationIdDTO entityVersDto(AccesPublicationId a) {
		ModelMapper mapper = new ModelMapper();
		AccesPublicationIdDTO map = mapper.map(a, AccesPublicationIdDTO.class);
		return map;
	}
	
	public List<AccesPublicationIdDTO> entityVersDto(List<AccesPublicationId> a) {
		return a.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public AccesPublicationId dtoVersEntity(AccesPublicationIdDTO a) {
		ModelMapper mapper = new ModelMapper();
		AccesPublicationId map = mapper.map(a, AccesPublicationId.class);
		return map;
	}
	
	public List<AccesPublicationId> dtoVersEntity(List<AccesPublicationIdDTO> a) {
		return a.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
	
}
