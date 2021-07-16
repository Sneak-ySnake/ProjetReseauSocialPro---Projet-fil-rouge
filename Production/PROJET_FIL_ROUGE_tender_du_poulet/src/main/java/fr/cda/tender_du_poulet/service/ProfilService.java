package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.ProfilRepository;
import fr.cda.tender_du_poulet.dto.ProfilDTO;
import fr.cda.tender_du_poulet.util.ProfilConverter;

@Service
public class ProfilService {

	private ProfilConverter converter = new ProfilConverter();
	
	@Autowired
	ProfilRepository profilRepository;
	
	public void ajoutProfil(ProfilDTO p) {
		profilRepository.save(converter.dtoVersEntity(p));
	}
	
	public ProfilDTO recupProfil(int id) {
		return converter.entityVersDto(profilRepository.findById(id).get());
	}
	
	public List<ProfilDTO> recupAllProfil(int id) {
		return converter.entityVersDto(profilRepository.findAll());
	}
}
