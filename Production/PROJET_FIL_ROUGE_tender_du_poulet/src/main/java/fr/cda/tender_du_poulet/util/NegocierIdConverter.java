package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Negocier;
import fr.cda.tender_du_poulet.beans.NegocierId;
import fr.cda.tender_du_poulet.dto.NegocierDTO;
import fr.cda.tender_du_poulet.dto.NegocierIdDTO;

@Component
public class NegocierIdConverter { 

		public NegocierIdDTO entityVersDto(NegocierId n) {
			ModelMapper mapper = new ModelMapper();
			NegocierIdDTO map = mapper.map(n, NegocierIdDTO.class);
			return map;
		}
		
		public List<NegocierIdDTO> entityVersDto(List<NegocierId> n) {
			return n.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());
		}
		
		public NegocierId dtoVersEntity(NegocierIdDTO n) {
			ModelMapper mapper = new ModelMapper();
			NegocierId map = mapper.map(n, NegocierId.class);
			return map;
		}
		
	 

	
}
