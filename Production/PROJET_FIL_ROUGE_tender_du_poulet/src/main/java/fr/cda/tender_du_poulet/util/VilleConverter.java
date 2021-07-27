package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Ville;
import fr.cda.tender_du_poulet.dto.VilleDTO;

@Component
public class VilleConverter {

	public VilleDTO entityVersDto(Ville v) {
		ModelMapper mapper = new ModelMapper();
		VilleDTO map = mapper.map(v, VilleDTO.class);
		return map;
	}
	
	public List<VilleDTO> entityVersDto(List<Ville> v) {
		return v.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public Ville dtoVersEntity(VilleDTO v) {
		ModelMapper mapper = new ModelMapper();
		Ville map = mapper.map(v, Ville.class);
		return map;
	}
	
	public List<Ville> dtoVersEntity(List<VilleDTO> v) {
		return v.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
	
}
