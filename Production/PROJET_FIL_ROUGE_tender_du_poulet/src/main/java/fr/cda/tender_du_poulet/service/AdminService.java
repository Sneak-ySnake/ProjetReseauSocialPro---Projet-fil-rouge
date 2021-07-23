package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.cda.tender_du_poulet.dao.AdminRepository;
import fr.cda.tender_du_poulet.dao.PublicationRepository;
import fr.cda.tender_du_poulet.dao.UtilisateurRepository;
import fr.cda.tender_du_poulet.dto.AdminDTO;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.dto.UtilisateurDTO;
import fr.cda.tender_du_poulet.iService.AdminInterfaceService;
import fr.cda.tender_du_poulet.util.AdminConverter;
import fr.cda.tender_du_poulet.util.PublicationConverter;
import fr.cda.tender_du_poulet.util.UtilisateurConverter;

@Service
public class AdminService implements AdminInterfaceService{
	
	private AdminConverter converter = new AdminConverter();
	
	private PublicationConverter publicationConverter = new PublicationConverter();
	
	private UtilisateurConverter utilisateurConverter = new UtilisateurConverter();
	
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	UtilisateurRepository utilisateurRepo;
	
	@Autowired
	PublicationRepository publicationRepo;
	
	public void ajoutAdmin (AdminDTO a) {
		adminRepo.save(converter.dtoVersEntity(a));
	}
	
	public AdminDTO recupAdmin (int id) {
		return converter.entityVersDto(adminRepo.findById(id).get());
	}
	
	public List<AdminDTO> recupAllAdmin () {
		return converter.entityVersDto(adminRepo.findAll());
	}
	
	public void deleteAdmin (int id) {
		adminRepo.deleteById(id);
	}
	
	public void updateAdmin (AdminDTO a) {
		adminRepo.save(converter.dtoVersEntity(a));	
	}

	public List<PublicationDTO> recupAllPublication() {
		return publicationConverter.entityVersDto(publicationRepo.findAll());
	}

	public List<UtilisateurDTO> recupAllUtilisateur() {
		// TODO Auto-generated method stub
		return utilisateurConverter.entityVersDto (utilisateurRepo.findAll());
	}


}
