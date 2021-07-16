package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import fr.cda.tender_du_poulet.beans.EtatCompte;
import fr.cda.tender_du_poulet.dto.EtatCompteDTO;

public class EtatCompteConverter {
	
	public EtatCompteDTO entityVersDto(EtatCompte ec) {
		ModelMapper mapper = new ModelMapper();
		EtatCompteDTO map = mapper.map(ec, EtatCompteDTO.class);
		return map;
	}

	public List<EtatCompteDTO> entityVersDto(List<EtatCompte> ec) {
		return ec.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
	}

	public EtatCompte dtoVersEntity(EtatCompteDTO ec) {
		ModelMapper mapper = new ModelMapper();
		EtatCompte map = mapper.map(ec, EtatCompte.class);
		return map;
	}
	
	public List<EtatCompte> dtoVersEntity(List<EtatCompteDTO> ec) {
		return ec.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
	}
}
