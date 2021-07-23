package fr.cda.tender_du_poulet.util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cda.tender_du_poulet.beans.Admin;
import fr.cda.tender_du_poulet.dto.AdminDTO;

@Component
public class AdminConverter {
	
	public AdminDTO entityVersDto (Admin a) {
		ModelMapper mapper = new ModelMapper();
		AdminDTO map = mapper.map (a, AdminDTO.class);
		return map;	
	}
	
	public List<AdminDTO> entityVersDto (List<Admin>a) {
		return a.stream().map(x -> entityVersDto(x)).collect(Collectors.toList());	
	}
	
	public Admin dtoVersEntity (AdminDTO a) {
		ModelMapper mapper = new ModelMapper();
		Admin map = mapper.map (a, Admin.class);
		return map;	
	}
	
	public List<Admin> dtoVersEntity (List<AdminDTO> a) {
		return a.stream().map(x -> dtoVersEntity(x)).collect(Collectors.toList());	
	}

}
