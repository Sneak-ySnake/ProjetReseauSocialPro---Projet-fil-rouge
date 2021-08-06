package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.ProfilRepository;
import fr.cda.tender_du_poulet.dto.ProfilDTO;
import fr.cda.tender_du_poulet.iService.ProfilInterfaceService;
import fr.cda.tender_du_poulet.util.ProfilConverter;

@Service
public class ProfilService implements ProfilInterfaceService {

	private ProfilConverter converter = new ProfilConverter();
	
	@Autowired
	ProfilRepository profilRepository;
	
	public void addProfil(ProfilDTO p) {
		profilRepository.save(converter.dtoVersEntity(p));
	}
	
	public ProfilDTO findProfil(int id) {
		return converter.entityVersDto(profilRepository.findById(id).get());
	}
	
	public List<ProfilDTO> findAllProfil() {
		return converter.entityVersDto(profilRepository.findAll());
	}
	
	public void updateProfil(ProfilDTO p) {
		profilRepository.save(converter.dtoVersEntity(p));
	}
	
	public void deleteProfil(int id) {
		profilRepository.deleteById(id);
	}
}
