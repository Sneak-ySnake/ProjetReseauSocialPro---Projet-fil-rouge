package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.TypePublication;
import fr.cda.tender_du_poulet.dto.TypePublicationDTO;

@Component
public class TypePublicationConverter {

	public TypePublicationDTO entityVersDto(TypePublication t) {
		ModelMapper mapper = new ModelMapper();
		TypePublicationDTO map = mapper.map(t, TypePublicationDTO.class);
		return map;
	}
	
	public List<TypePublicationDTO> entityVersDto(List<TypePublication> t) {
		return t.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public TypePublication dtoVersEntity(TypePublicationDTO t) {
		ModelMapper mapper = new ModelMapper();
		TypePublication map = mapper.map(t, TypePublication.class);
		return map;
	}
	
	public List<TypePublication> dtoVersEntity(List<TypePublicationDTO> t) {
		return t.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
	
}
