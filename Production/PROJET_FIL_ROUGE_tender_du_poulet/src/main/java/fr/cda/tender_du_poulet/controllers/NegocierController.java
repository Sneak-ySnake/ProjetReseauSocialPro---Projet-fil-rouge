package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.dto.NegocierDTO;
import fr.cda.tender_du_poulet.service.NegocierService;

@RestController
public class NegocierController {
 
		@Autowired
		private NegocierService service = new NegocierService();
	 
		@PostMapping(value = "/ajoutNegocier")
		public void ajoutNegocier(@RequestBody NegocierDTO n) {
			service.ajoutNegocier(n);
		}
		
		
	 
}
