package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Favori;
import fr.cda.tender_du_poulet.dto.FavoriDTO;

@Component
public class FavoriConverter {

 
	public FavoriDTO entityVersDto(Favori f) {
		ModelMapper mapper = new ModelMapper();
		FavoriDTO map = mapper.map(f, FavoriDTO.class);
		return map;
	}
	
	public List<FavoriDTO> entityVersDto(List<Favori> f) {
		return f.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public Favori dtoVersEntity(FavoriDTO f) {
		ModelMapper mapper = new ModelMapper();
		Favori map = mapper.map(f, Favori.class);
		return map;
	}
	
	
}
