package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.AdministrerUtilisateur;
import fr.cda.tender_du_poulet.dto.AdministrerUtilisateurDTO;

@Component
public class AdministrerUtilisateurConverter {
	
	public AdministrerUtilisateurDTO entityVersDto (AdministrerUtilisateur a) {
		ModelMapper mapper = new ModelMapper();
		AdministrerUtilisateurDTO map = mapper.map(a, AdministrerUtilisateurDTO.class);
		return map;	
	}
	
	public List<AdministrerUtilisateurDTO> entityVersDto (List<AdministrerUtilisateur> a) {
		return a.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}
	
	public AdministrerUtilisateur dtoVersEntity (AdministrerUtilisateurDTO a) {
		ModelMapper mapper = new ModelMapper();
		AdministrerUtilisateur map = mapper.map(a, AdministrerUtilisateur.class);
		return map;	
	}
	
	public List<AdministrerUtilisateur> dtoVersEntity (List<AdministrerUtilisateurDTO> a) {
		return a.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
}
