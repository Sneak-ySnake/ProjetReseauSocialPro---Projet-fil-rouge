package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.NegocierRepository;
import fr.cda.tender_du_poulet.dto.NegocierDTO;
import fr.cda.tender_du_poulet.iService.NegociationInterfaceService;
import fr.cda.tender_du_poulet.iService.NegocierInterfaceService;
import fr.cda.tender_du_poulet.util.NegocierConverter;

@Service
public class NegocierService implements NegocierInterfaceService{
	
	private NegocierConverter negocierconverter = new NegocierConverter();
	
	@Autowired
	NegocierRepository negocierRepository;
	
	public void ajoutNegocier(NegocierDTO n) {
		negocierRepository.save(negocierconverter.dtoVersEntity(n));
	}
	
	public NegocierDTO recupNegocier(int id) {
		return negocierconverter.entityVersDto(negocierRepository.findById(id).get());
	}
	
	public List<NegocierDTO> recupAllNegocier() {
		return negocierconverter.entityVersDto(negocierRepository.findAll());
	}

}
