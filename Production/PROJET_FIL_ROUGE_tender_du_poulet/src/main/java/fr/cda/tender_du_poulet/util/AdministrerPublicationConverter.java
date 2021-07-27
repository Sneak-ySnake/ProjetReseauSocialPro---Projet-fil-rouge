package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.AdministrerPublication;
import fr.cda.tender_du_poulet.beans.AdministrerUtilisateur;
import fr.cda.tender_du_poulet.dto.AdministrerPublicationDTO;
import fr.cda.tender_du_poulet.dto.AdministrerUtilisateurDTO;

@Component
public class AdministrerPublicationConverter {

		
		public AdministrerPublicationDTO entityVersDto (AdministrerPublication a) {
			ModelMapper mapper = new ModelMapper();
			AdministrerPublicationDTO map = mapper.map(a, AdministrerPublicationDTO.class);
			return map;	
		}
		
		public List<AdministrerPublicationDTO> entityVersDto (List<AdministrerPublication> a) {
			return a.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
		}
		
		public AdministrerPublication dtoVersEntity (AdministrerPublicationDTO a) {
			ModelMapper mapper = new ModelMapper();
			AdministrerPublication map = mapper.map(a, AdministrerPublication.class);
			return map;	
		}
		
		public List<AdministrerPublication> dtoVersEntity (List<AdministrerPublicationDTO> a) {
			return a.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());
		}

}
