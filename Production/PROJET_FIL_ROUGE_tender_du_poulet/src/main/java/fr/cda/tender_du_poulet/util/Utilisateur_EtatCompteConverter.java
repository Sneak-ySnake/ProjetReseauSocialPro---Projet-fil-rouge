package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import fr.cda.tender_du_poulet.beans.Utilisateur_EtatCompte;
import fr.cda.tender_du_poulet.dto.Utilisateur_EtatCompteDTO;

public class Utilisateur_EtatCompteConverter {
	
	public Utilisateur_EtatCompteDTO entityVersDto(Utilisateur_EtatCompte uec) {
		ModelMapper mapper = new ModelMapper();
		Utilisateur_EtatCompteDTO map = mapper.map(uec, Utilisateur_EtatCompteDTO.class);
		return map;
	}

	public List<Utilisateur_EtatCompteDTO> entityVersDto(List<Utilisateur_EtatCompte> uec) {
		return uec.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}

	public Utilisateur_EtatCompte dtoVersEntity(Utilisateur_EtatCompteDTO uec) {
		ModelMapper mapper = new ModelMapper();
		Utilisateur_EtatCompte map = mapper.map(uec, Utilisateur_EtatCompte.class);
		return map;
	}
	
	public List<Utilisateur_EtatCompte> dtoVersEntity(List<Utilisateur_EtatCompteDTO> uec) {
		return uec.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
}
