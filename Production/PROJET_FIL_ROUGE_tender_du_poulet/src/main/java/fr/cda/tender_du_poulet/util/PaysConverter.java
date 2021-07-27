package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Pays;
import fr.cda.tender_du_poulet.dto.PaysDTO;

@Component
public class PaysConverter {

	public PaysDTO entityVersDto(Pays p) {
		ModelMapper mapper = new ModelMapper();
		PaysDTO map = mapper.map(p, PaysDTO.class);
		return map;
	}
	
	public List<PaysDTO> entityVersDto(List<Pays> p) {
		return p.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public Pays dtoVersEntity(PaysDTO p) {
		ModelMapper mapper = new ModelMapper();
		Pays map = mapper.map(p, Pays.class);
		return map;
	}
	
	public List<Pays> dtoVersEntity(List<PaysDTO> p) {
		return p.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
	
}
