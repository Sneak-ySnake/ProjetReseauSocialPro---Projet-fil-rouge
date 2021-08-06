package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.DomaineRepository;
import fr.cda.tender_du_poulet.dto.DomaineDTO;
import fr.cda.tender_du_poulet.iService.DomaineInterfaceService;
import fr.cda.tender_du_poulet.util.DomaineConverter;

@Service
public class DomaineService implements DomaineInterfaceService {

	private DomaineConverter converter = new DomaineConverter();
	
	@Autowired
	DomaineRepository domaineRepository;
	
	public void addDomaine(DomaineDTO u) {
		domaineRepository.save(converter.dtoVersEntity(u));
	}
	
	public DomaineDTO findDomaine(int id) {
		return converter.entityVersDto(domaineRepository.findById(id).get());
	}
	
	public List<DomaineDTO> findAllDomaine() {
		return converter.entityVersDto(domaineRepository.findAll());
	}
	
	public void updateDomaine(DomaineDTO d) {
		domaineRepository.save(converter.dtoVersEntity(d));
	}
	
	public void deleteDomaine(int id) {
		domaineRepository.deleteById(id);
	}
}
