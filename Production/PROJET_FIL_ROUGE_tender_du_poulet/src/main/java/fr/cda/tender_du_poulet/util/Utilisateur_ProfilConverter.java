package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import fr.cda.tender_du_poulet.beans.Utilisateur_Profil;
import fr.cda.tender_du_poulet.dto.Utilisateur_ProfilDTO;

public class Utilisateur_ProfilConverter {
	
	public Utilisateur_ProfilDTO entityVersDto(Utilisateur_Profil up) {
		ModelMapper mapper = new ModelMapper();
		Utilisateur_ProfilDTO map = mapper.map(up, Utilisateur_ProfilDTO.class);
		return map;
	}

	public List<Utilisateur_ProfilDTO> entityVersDto(List<Utilisateur_Profil> up) {
		return up.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}

	public Utilisateur_Profil dtoVersEntity(Utilisateur_ProfilDTO up) {
		ModelMapper mapper = new ModelMapper();
		Utilisateur_Profil map = mapper.map(up, Utilisateur_Profil.class);
		return map;
	}
	
	public List<Utilisateur_Profil> dtoVersEntity(List<Utilisateur_ProfilDTO> up) {
		return up.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
}
