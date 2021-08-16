package fr.cda.tender_du_poulet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.NegocierId;
import fr.cda.tender_du_poulet.dto.NegocierDTO;
import fr.cda.tender_du_poulet.dto.PublicationDTO;
import fr.cda.tender_du_poulet.metiers.NegocierVerif;
import fr.cda.tender_du_poulet.service.NegocierService;

@RestController
public class NegocierController {
 
		@Autowired
		private NegocierService negocierService = new NegocierService();
		
		private NegocierVerif negocierVerif = new NegocierVerif();
		
	 
		@PostMapping(value = "/addNegocier")
		public void addNegocier(@RequestBody NegocierDTO n) {
			negocierService.addNegocier(n);
		}
		
		@GetMapping(value = "/findAllNegocier")
		public List<NegocierDTO> findAllNegocier() {
			return negocierService.findAllNegocier();
		}
		
		@PostMapping(value = "/findNegocier")
		public NegocierDTO findNegocier(@RequestBody NegocierId id) {
			return negocierService.findNegocier(id);
		}
		
		@PostMapping(value = "/deleteNegocier")
		public void deleteNegocier(@RequestBody NegocierId id) {
			negocierService.deleteNegocier(id);
		}
		
		@PostMapping(value = "/updateNegocier")
		public void updateNegocier(@RequestBody NegocierDTO n) {
			negocierService.updateNegocier(n);
		}

		@PostMapping(value = "/findAllNegocierPublication")
		public List<NegocierDTO> findAllNegocierPublication(@RequestBody PublicationDTO p) {
			return negocierService.findAllNegocierPublication(p.getId_publication(), p.getUtilisateur().getId_utilisateur());
		}
		
		@PostMapping(value = "/findAllMessagePublication")
		public List<NegocierDTO> findAllMessagePublication(@RequestBody NegocierDTO n) {
			return negocierService.findAllMessagePublication(n.getId_negocier().getPublication().getId_publication(), n.getId_negocier().getId_negociation());
		}
		
		@PostMapping(value = "/negocierVerification")
		public boolean negocierVerification(@RequestBody NegocierDTO n) {
			if(negocierVerif.isNotEmpty(n.getMessage())) {
				return true;
			}
			else {
				return false;
			}
		}
	 
}
