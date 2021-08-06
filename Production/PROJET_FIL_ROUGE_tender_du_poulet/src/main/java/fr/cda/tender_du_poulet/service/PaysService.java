package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.PaysRepository;
import fr.cda.tender_du_poulet.dto.PaysDTO;
import fr.cda.tender_du_poulet.dto.ProfilDTO;
import fr.cda.tender_du_poulet.iService.PaysInterfaceService;
import fr.cda.tender_du_poulet.util.PaysConverter;

@Service
public class PaysService implements PaysInterfaceService {

	private PaysConverter converter = new PaysConverter();
	
	@Autowired
	private PaysRepository paysRepository;
	
	public void addPays(PaysDTO p) {
		paysRepository.save(converter.dtoVersEntity(p));
	}
	
	public PaysDTO findPays(int id) {
		return converter.entityVersDto(paysRepository.findById(id).get());
	}
	
	public List<PaysDTO> findAllPays() {
		return converter.entityVersDto(paysRepository.findAll());
	}
	
	public void updatePays(PaysDTO p) {
		paysRepository.save(converter.dtoVersEntity(p));
	}
	
	public void deletePays(int id) {
		paysRepository.deleteById(id);
	}
	
}
