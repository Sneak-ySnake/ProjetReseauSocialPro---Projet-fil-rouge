package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import fr.cda.tender_du_poulet.beans.Utilisateur_EtatCompteId;
import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteIdDTO;

public class Utilisateur_EtatCompteIdConverter {

	public Utilisateur_EtatCompteIdDTO entityVersDto(Utilisateur_EtatCompteId up) {
		ModelMapper mapper = new ModelMapper();
		Utilisateur_EtatCompteIdDTO map = mapper.map(up, Utilisateur_EtatCompteIdDTO.class);
		return map;
	}

	public List<Utilisateur_EtatCompteIdDTO> entityVersDto(List<Utilisateur_EtatCompteId> up) {
		return up.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}

	public Utilisateur_EtatCompteId dtoVersEntity(Utilisateur_EtatCompteIdDTO up) {
		ModelMapper mapper = new ModelMapper();
		Utilisateur_EtatCompteId map = mapper.map(up, Utilisateur_EtatCompteId.class);
		return map;
	}
	
	public List<Utilisateur_EtatCompteId> dtoVersEntity(List<Utilisateur_EtatCompteIdDTO> up) {
		return up.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
}
