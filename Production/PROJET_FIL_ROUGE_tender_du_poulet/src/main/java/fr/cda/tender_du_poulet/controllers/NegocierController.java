package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.NegocierId;
import fr.cda.tender_du_poulet.dto.NegocierDTO;
import fr.cda.tender_du_poulet.dto.NegocierIdDTO;
import fr.cda.tender_du_poulet.service.NegocierService;

@RestController
public class NegocierController {
 
		@Autowired
		private NegocierService negocierService = new NegocierService();
	 
		@PostMapping(value = "/ajoutNegocier")
		public void ajoutNegocier(@RequestBody NegocierDTO n) {
			negocierService.ajoutNegocier(n);
		}
		
		@GetMapping(value = "/recupAllNegocier")
		public List<NegocierDTO> recupAllNegocier() {
			return negocierService.recupAllNegocier();
		}
		
		@PostMapping(value = "/recupNegocier")
		public NegocierDTO recupNegocier(@RequestBody NegocierId id) {
			return negocierService.recupNegocier(id);
		}
		
		@PostMapping(value = "/supprimerNegocier")
		public void supprimerNegocier(@RequestBody NegocierId id) {
			negocierService.supprimerNegocier(id);
		}
		
		@PostMapping(value = "/modifNegocier")
		public void modifNegocier(@RequestBody NegocierDTO n) {
			negocierService.modifNegocier(n);
		}

		
	 
}
