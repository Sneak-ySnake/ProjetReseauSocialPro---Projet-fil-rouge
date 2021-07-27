package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.VilleRepository;
import fr.cda.tender_du_poulet.dto.VilleDTO;
import fr.cda.tender_du_poulet.iService.VilleInterfaceService;
import fr.cda.tender_du_poulet.util.VilleConverter;

@Service
public class VilleService implements VilleInterfaceService {

	private VilleConverter converter = new VilleConverter();
	
	@Autowired
	private VilleRepository villeRepository;
	
	public void ajoutVille(VilleDTO v) {
		villeRepository.save(converter.dtoVersEntity(v));
	}
	
	public VilleDTO recupVille(int id) {
		return converter.entityVersDto(villeRepository.findById(id).get());
	}
	
	public List<VilleDTO> recupAllVille() {
		return converter.entityVersDto(villeRepository.findAll());
	}
	
	public void supprimerVille(int id) {
		villeRepository.deleteById(id);
	}
	
}
