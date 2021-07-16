package fr.cda.tender_du_poulet.service;
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.NegociationRepository;
import fr.cda.tender_du_poulet.dto.NegociationDTO;
import fr.cda.tender_du_poulet.util.NegociationConverter;

@Service
public class NegociationService {
	
	private NegociationConverter negociationconverter = new NegociationConverter();
	
	@Autowired
	NegociationRepository negociationRepository;
	
	public void ajoutNegocier(NegociationDTO p) {
		negociationRepository.save(negociationconverter.dtoVersEntity(p));
	}
	
	public NegociationDTO recupNegociation(int id) {
		return negociationconverter.entityVersDto(negociationRepository.findById(id).get());
	}
	
	public List<NegociationDTO> recupAllNegociation(int id) {
		return negociationconverter.entityVersDto(negociationRepository.findAll());
	}

}

