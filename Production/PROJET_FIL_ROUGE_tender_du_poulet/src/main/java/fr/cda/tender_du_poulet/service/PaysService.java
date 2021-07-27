package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.PaysRepository;
import fr.cda.tender_du_poulet.dto.PaysDTO;
import fr.cda.tender_du_poulet.iService.PaysInterfaceService;
import fr.cda.tender_du_poulet.util.PaysConverter;

@Service
public class PaysService implements PaysInterfaceService {

	private PaysConverter converter = new PaysConverter();
	
	@Autowired
	private PaysRepository paysRepository;
	
	public void ajoutPays(PaysDTO p) {
		paysRepository.save(converter.dtoVersEntity(p));
	}
	
	public PaysDTO recupPays(int id) {
		return converter.entityVersDto(paysRepository.findById(id).get());
	}
	
	public List<PaysDTO> recupAllPays() {
		return converter.entityVersDto(paysRepository.findAll());
	}
	
	public void supprimerPays(int id) {
		paysRepository.deleteById(id);
	}
	
}
