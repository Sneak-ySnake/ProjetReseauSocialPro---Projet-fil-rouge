package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.EtatPublication;
import fr.cda.tender_du_poulet.dto.EtatPublicationDTO;

@Component
public class EtatPublicationConverter {

	public EtatPublicationDTO entityVersDto(EtatPublication e) {
		ModelMapper mapper = new ModelMapper();
		EtatPublicationDTO map = mapper.map(e, EtatPublicationDTO.class);
		return map;
	}
	
	public List<EtatPublicationDTO> entityVersDto(List<EtatPublication> e) {
		return e.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public EtatPublication dtoVersEntity(EtatPublicationDTO e) {
		ModelMapper mapper = new ModelMapper();
		EtatPublication map = mapper.map(e, EtatPublication.class);
		return map;
	}
	
	public List<EtatPublication> dtoVersEntity(List<EtatPublicationDTO> e) {
		return e.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
	
}
