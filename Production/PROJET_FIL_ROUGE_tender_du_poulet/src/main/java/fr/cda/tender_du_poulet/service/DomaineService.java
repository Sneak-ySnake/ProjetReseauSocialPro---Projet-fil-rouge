package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.DomaineRepository;
import fr.cda.tender_du_poulet.dto.DomaineDTO;
import fr.cda.tender_du_poulet.util.DomaineConverter;

@Service
public class DomaineService {

	private DomaineConverter converter = new DomaineConverter();
	
	@Autowired
	DomaineRepository domaineRepository;
	
	public void ajoutDomaine(DomaineDTO u) {
		domaineRepository.save(converter.dtoVersEntity(u));
	}
	
	public DomaineDTO recupDomaine(int id) {
		return converter.entityVersDto(domaineRepository.findById(id).get());
	}
	
	public List<DomaineDTO> recupAllDomaine(int id) {
		return converter.entityVersDto(domaineRepository.findAll());
	}
}