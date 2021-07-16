package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.AdministrerPublicationId;
import fr.cda.tender_du_poulet.dto.AdministrerPublicationIdDTO;

@Component
public class AdministrerPublicationIdConverter {
	
	public AdministrerPublicationIdDTO entityVersDto (AdministrerPublicationId a) {
		ModelMapper mapper = new ModelMapper();
		AdministrerPublicationIdDTO map = mapper.map(a, AdministrerPublicationIdDTO.class);
		return map;	
	}
	
	public List<AdministrerPublicationIdDTO> entityVersDto (List<AdministrerPublicationId> a) {
		return a.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public AdministrerPublicationId dtoVersEntity (AdministrerPublicationIdDTO a) {
		ModelMapper mapper = new ModelMapper();
		AdministrerPublicationId map = mapper.map(a, AdministrerPublicationId.class);
		return map;	
	}
	
	public List<AdministrerPublicationId> DtoVersEntity (List<AdministrerPublicationIdDTO> a) {
		return a.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}


}
