package fr.cda.tender_du_poulet.service;
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.NegociationRepository;
import fr.cda.tender_du_poulet.dto.NegociationDTO;
import fr.cda.tender_du_poulet.iService.NegociationInterfaceService;
import fr.cda.tender_du_poulet.util.NegociationConverter;

@Service
public class NegociationService implements NegociationInterfaceService {
	
	private NegociationConverter negociationconverter = new NegociationConverter();
	
	@Autowired
	NegociationRepository negociationRepository;

	public void addNegociation(NegociationDTO n) {
		negociationRepository.save(negociationconverter.dtoVersEntity(n));
	}
	
	public NegociationDTO findNegociation(int id) {
		return negociationconverter.entityVersDto(negociationRepository.findById(id).get());
	}
	
	public List<NegociationDTO> findAllNegociation() {
		return negociationconverter.entityVersDto(negociationRepository.findAll());
	}

	  
	public void deleteNegociation(int id) {
		negociationRepository.deleteById(id);
	}
	
	public void updateNegociation(NegociationDTO n) {
		negociationRepository.save(negociationconverter.dtoVersEntity(n));
	}


}

