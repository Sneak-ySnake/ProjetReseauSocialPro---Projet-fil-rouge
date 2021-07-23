package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.NegocierRepository;
import fr.cda.tender_du_poulet.dto.NegocierDTO;
import fr.cda.tender_du_poulet.util.NegocierConverter;

@Service
public class NegocierService {
	
	private NegocierConverter negocierconverter = new NegocierConverter();
	
	@Autowired
	NegocierRepository negocierRepository;
	
	public void ajoutNegocier(NegocierDTO p) {
		negocierRepository.save(negocierconverter.dtoVersEntity(p));
	}
	
	public NegocierDTO recupNegocier(int id) {
		return negocierconverter.entityVersDto(negocierRepository.findById(id).get());
	}
	
	public List<NegocierDTO> recupAllNegocier() {
		return negocierconverter.entityVersDto(negocierRepository.findAll());
	}

}
