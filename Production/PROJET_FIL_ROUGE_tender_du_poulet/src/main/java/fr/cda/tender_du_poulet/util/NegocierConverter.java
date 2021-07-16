package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Negocier;
import fr.cda.tender_du_poulet.dto.NegocierDTO;

@Component
public class NegocierConverter { 

		public NegocierDTO entityVersDto(Negocier n) {
			ModelMapper mapper = new ModelMapper();
			NegocierDTO map = mapper.map(n, NegocierDTO.class);
			return map;
		}
		
		public List<NegocierDTO> entityVersDto(List<Negocier> n) {
			return n.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
		}
		
		public Negocier dtoVersEntity(NegocierDTO n) {
			ModelMapper mapper = new ModelMapper();
			Negocier map = mapper.map(n, Negocier.class);
			return map;
		}
		
	 

	
}
