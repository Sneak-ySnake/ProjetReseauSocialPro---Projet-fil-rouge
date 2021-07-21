package fr.cda.tender_du_poulet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.DomaineRepository;
import fr.cda.tender_du_poulet.dto.DomaineDTO;
import fr.cda.tender_du_poulet.iService.DomaineInterfaceService;
import fr.cda.tender_du_poulet.util.DomaineConverter;
import fr.cda.tpemploye.beans.Emp;

@Service
public class DomaineService implements DomaineInterfaceService {

	private DomaineConverter converter = new DomaineConverter();
	
	@Autowired
	DomaineRepository domaineRepository;
	
	public void ajoutDomaine(DomaineDTO u) {
		domaineRepository.save(converter.dtoVersEntity(u));
	}
	
	public DomaineDTO recupDomaine(int id) {
		return converter.entityVersDto(domaineRepository.findById(id).get());
	}
	
	public List<DomaineDTO> recupAllDomaine() {
		return converter.entityVersDto(domaineRepository.findAll());
	}
	
	
	@Modifying
    @Query("UPDATE DomaineDTO d SET d.nom_domaine = :nomDomaine WHERE d.id = :id")
	public void modifDomaine(@Param("id") int id, @Param("nomDomaine") String nomDomaine) {
		domaineRepository.
	}
}
