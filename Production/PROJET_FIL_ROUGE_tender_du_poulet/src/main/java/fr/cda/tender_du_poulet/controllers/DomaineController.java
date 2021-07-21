package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.DomaineDTO;
import fr.cda.tender_du_poulet.service.DomaineService;

@RestController
public class DomaineController {
	
	@Autowired
	private DomaineService domaineService;
	
	@RequestMapping(value = "/addDomaine", method = RequestMethod.POST)
	public void ajoutDomaine(@RequestBody DomaineDTO d) {
		domaineService.ajoutDomaine(d);
	}

	@RequestMapping(value = "/findDomaine", method = RequestMethod.POST)
	public DomaineDTO recupDomaine(@RequestBody String id) {
		int idDomaine = Integer.parseInt(id);
		return domaineService.recupDomaine(idDomaine);
	}
	
	@RequestMapping(value = "/findAllDomaine", method = RequestMethod.POST)
	public List<DomaineDTO> recupAllDomaine() {
		return domaineService.recupAllDomaine();
	}

	@RequestMapping(value = "/updateDomaine", method = RequestMethod.POST)
	public void modifDomaine(@RequestBody DomaineDTO d) {
		domaineService.modifDomaine(d);
	}

	@RequestMapping(value = "/deleteDomaine", method = RequestMethod.POST)
	public void supprimerDomaine(@RequestBody String id) {
		int idDomaine = Integer.parseInt(id);
		domaineService.supprimerDomaine(idDomaine);
	}
}
