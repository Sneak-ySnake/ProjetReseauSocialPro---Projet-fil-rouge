package fr.cda.tender_du_poulet.controllers;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.FavoriId;
import fr.cda.tender_du_poulet.dto.FavoriDTO;
import fr.cda.tender_du_poulet.dto.FavoriIdDTO;
import fr.cda.tender_du_poulet.service.FavoriService;

@RestController
public class FavoriController {

	@Autowired
	private FavoriService service = new FavoriService();
	
	@GetMapping(value = "/recupAllFavori")
	public List<FavoriDTO> recupAllFavori() {
		return service.recupAllFavori();
	}
	
	@GetMapping(value = "/recupFavori")
	public FavoriDTO recupFavori(@RequestBody FavoriId id) {
		return service.recupFavori(id);
	}
	
	@PostMapping(value = "/ajoutFavori")
	public void ajoutFavori(@RequestBody FavoriDTO f) {
		service.ajoutFavori(f);
	}
	
	
}
