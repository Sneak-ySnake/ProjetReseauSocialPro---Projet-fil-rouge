package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.beans.NegocierId;
import fr.cda.tender_du_poulet.dao.NegocierRepository;
import fr.cda.tender_du_poulet.dto.NegocierDTO;
import fr.cda.tender_du_poulet.iService.NegocierInterfaceService;
import fr.cda.tender_du_poulet.util.NegocierConverter;

@Service
public class NegocierService implements NegocierInterfaceService{
	
	private NegocierConverter negocierConverter = new NegocierConverter();
	
	
	@Autowired
	NegocierRepository negocierRepository;
	
	public void addNegocier(NegocierDTO n) {
		negocierRepository.save(negocierConverter.dtoVersEntity(n));
	}

	public NegocierDTO findNegocier(NegocierId id) {
		return negocierConverter.entityVersDto(negocierRepository.findById(id).get());
		 
	} 

	public List<NegocierDTO> findAllNegocier() {
		return negocierConverter.entityVersDto(negocierRepository.findAll());
		 
	}

	public void deleteNegocier(NegocierId id) {
		negocierRepository.deleteById(id);
	}

	public void updateNegocier(NegocierDTO n) {
		negocierRepository.save(negocierConverter.dtoVersEntity(n));
	}

	
	public List<NegocierDTO> findAllNegocierPublication(int id_publication) {
		List<NegocierDTO> listeNegocier = negocierConverter.entityVersDto(negocierRepository.findAllNegocierPublication(id_publication));
		return listeNegocier;
	}
	 
	 

}
