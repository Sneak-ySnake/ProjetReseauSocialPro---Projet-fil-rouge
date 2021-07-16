package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Utilisateur;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;

@Component
public class UtilisateurConverter {
	
	public UtilisateurDTO entityVersDto(Utilisateur u) {
		ModelMapper mapper = new ModelMapper();
		UtilisateurDTO map = mapper.map(u, UtilisateurDTO.class);
		return map;
	}

	public List<UtilisateurDTO> entityVersDto(List<Utilisateur> u) {
		return u.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}

	public Utilisateur dtoVersEntity(UtilisateurDTO u) {
		ModelMapper mapper = new ModelMapper();
		Utilisateur map = mapper.map(u, Utilisateur.class);
		return map;
	}
	
	public List<Utilisateur> dtoVersEntity(List<UtilisateurDTO> u) {
		return u.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
}
