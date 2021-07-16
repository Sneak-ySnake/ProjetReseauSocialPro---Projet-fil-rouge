package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.cda.tender_du_poulet.dao.AdminRepository;
import fr.cda.tender_du_poulet.dto.AdminDTO;
import fr.cda.tender_du_poulet.util.AdminConverter;

@Service
public class AdminService {
	
	private AdminConverter converter = new AdminConverter();
	
	@Autowired
	AdminRepository adminRepo;
	
	public void ajoutAdmin (AdminDTO a) {
		adminRepo.save(converter.dtoVersEntity(a));
	}
	
	public AdminDTO recupAdmin (int id) {
		return converter.entityVersDto(adminRepo.findById(id).get());
	}
	
	public List<AdminDTO> reculAllPublication(int id) {
		return converter.entityVersDto(adminRepo.findAll());
	}

}
