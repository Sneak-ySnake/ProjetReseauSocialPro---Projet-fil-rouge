package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import fr.cda.tender_du_poulet.beans.Utilisateur_ProfilId;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilIdDTO;

public class Utilisateur_ProfilIdConverter {

	public Utilisateur_ProfilIdDTO entityVersDto(Utilisateur_ProfilId up) {
		ModelMapper mapper = new ModelMapper();
		Utilisateur_ProfilIdDTO map = mapper.map(up, Utilisateur_ProfilIdDTO.class);
		return map;
	}

	public List<Utilisateur_ProfilIdDTO> entityVersDto(List<Utilisateur_ProfilId> up) {
		return up.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}

	public Utilisateur_ProfilId dtoVersEntity(Utilisateur_ProfilIdDTO up) {
		ModelMapper mapper = new ModelMapper();
		Utilisateur_ProfilId map = mapper.map(up, Utilisateur_ProfilId.class);
		return map;
	}
	
	public List<Utilisateur_ProfilId> dtoVersEntity(List<Utilisateur_ProfilIdDTO> up) {
		return up.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
}
