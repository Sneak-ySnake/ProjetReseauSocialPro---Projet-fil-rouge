package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Profil;
import fr.cda.tender_du_poulet.dto.ProfilDTO;

@Component
public class ProfilConverter {
	
	public ProfilDTO entityVersDto(Profil p) {
		ModelMapper mapper = new ModelMapper();
		ProfilDTO map = mapper.map(p, ProfilDTO.class);
		return map;
	}

	public List<ProfilDTO> entityVersDto(List<Profil> p) {
		return p.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}

	public Profil dtoVersEntity(ProfilDTO p) {
		ModelMapper mapper = new ModelMapper();
		Profil map = mapper.map(p, Profil.class);
		return map;
	}
	
	public List<Profil> dtoVersEntity(List<ProfilDTO> p) {
		return p.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
}
