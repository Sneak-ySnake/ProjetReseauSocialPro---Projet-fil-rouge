package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Negociation;
import fr.cda.tender_du_poulet.dto.NegociationDTO;

@Component
public class NegociationConverter {


	public NegociationDTO entityVersDto(Negociation n) {
		ModelMapper mapper = new ModelMapper();
		NegociationDTO map = mapper.map(n, NegociationDTO.class);
		return map;
	}
	
	public List<NegociationDTO> entityVersDto(List<Negociation> n) {
		return n.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public Negociation dtoVersEntity(NegociationDTO n) {
		ModelMapper mapper = new ModelMapper();
		Negociation map = mapper.map(n, Negociation.class);
		return map;
	}
	
	
}
