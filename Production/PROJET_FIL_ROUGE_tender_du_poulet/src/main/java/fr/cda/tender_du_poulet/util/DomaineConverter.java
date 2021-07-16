package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import fr.cda.tender_du_poulet.beans.Domaine;
import fr.cda.tender_du_poulet.dto.DomaineDTO;

public class DomaineConverter {
	
	public DomaineDTO entityVersDto(Domaine d) {
		ModelMapper mapper = new ModelMapper();
		DomaineDTO map = mapper.map(d, DomaineDTO.class);
		return map;
	}

	public List<DomaineDTO> entityVersDto(List<Domaine> d) {
		return d.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}

	public Domaine dtoVersEntity(DomaineDTO d) {
		ModelMapper mapper = new ModelMapper();
		Domaine map = mapper.map(d, Domaine.class);
		return map;
	}
	
	public List<Domaine> dtoVersEntity(List<DomaineDTO> d) {
		return d.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}

}
