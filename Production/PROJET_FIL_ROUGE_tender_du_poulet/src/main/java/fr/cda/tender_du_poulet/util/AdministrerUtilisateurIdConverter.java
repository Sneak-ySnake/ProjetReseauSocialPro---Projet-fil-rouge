package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.AdministrerUtilisateurId;
import fr.cda.tender_du_poulet.dto.AdministrerUtilisateurIdDTO;

	@Component
	public class AdministrerUtilisateurIdConverter {
		
		public AdministrerUtilisateurIdDTO entityVersDto (AdministrerUtilisateurId a) {
			ModelMapper mapper = new ModelMapper();
			AdministrerUtilisateurIdDTO map = mapper.map(a, AdministrerUtilisateurIdDTO.class);
			return map;	
		}
		
		public List<AdministrerUtilisateurIdDTO> entityVersDto (List<AdministrerUtilisateurId> a) {
			return a.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
		}
		
		public AdministrerUtilisateurId dtoVersEntity (AdministrerUtilisateurIdDTO a) {
			ModelMapper mapper = new ModelMapper();
			AdministrerUtilisateurId map = mapper.map(a, AdministrerUtilisateurId.class);
			return map;	
		}
		
		public List<AdministrerUtilisateurId> dtoVersEntity (List<AdministrerUtilisateurIdDTO> a) {
			return a.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
		}

}
