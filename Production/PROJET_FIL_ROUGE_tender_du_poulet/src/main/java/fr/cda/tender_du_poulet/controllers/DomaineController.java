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
	public void addDomaine(@RequestBody DomaineDTO d) {
		domaineService.addDomaine(d);
	}

	@RequestMapping(value = "/findDomaine", method = RequestMethod.POST)
	public DomaineDTO findDomaine(@RequestBody String id) {
		int idDomaine = Integer.parseInt(id);
		return domaineService.findDomaine(idDomaine);
	}
	
	@RequestMapping(value = "/findAllDomaine", method = RequestMethod.POST)
	public List<DomaineDTO> findAllDomaine() {
		return domaineService.findAllDomaine();
	}

	@RequestMapping(value = "/updateDomaine", method = RequestMethod.POST)
	public void updateDomaine(@RequestBody DomaineDTO d) {
		domaineService.updateDomaine(d);
	}

	@RequestMapping(value = "/deleteDomaine", method = RequestMethod.POST)
	public void deleteDomaine(@RequestBody String id) {
		int idDomaine = Integer.parseInt(id);
		domaineService.deleteDomaine(idDomaine);
	}
}
