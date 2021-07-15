package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Publication;
import fr.cda.tender_du_poulet.dto.PublicationDTO;

@Component
public class PublicationConverter {

	public PublicationDTO entityVersDto(Publication p) {
		ModelMapper mapper = new ModelMapper();
		PublicationDTO map = mapper.map(p, PublicationDTO.class);
		return map;
	}
	
	public List<PublicationDTO> entityVersDto(List<Publication> p) {
		return p.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public Publication dtoVersEntity(PublicationDTO p) {
		ModelMapper mapper = new ModelMapper();
		Publication map = mapper.map(p, Publication.class);
		return map;
	}
	
	public List<Publication> dtoVersEntity(List<PublicationDTO> p) {
		return p.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
	
}
	
	