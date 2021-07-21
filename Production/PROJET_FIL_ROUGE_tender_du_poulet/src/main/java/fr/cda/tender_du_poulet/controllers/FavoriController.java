package fr.cda.tender_du_poulet.controllers;
 
 

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.cda.tender_du_poulet.dto.FavoriDTO;
import fr.cda.tender_du_poulet.service.FavoriService;

@Controller
public class FavoriController {


	private FavoriService service = new FavoriService();
	
	@GetMapping(value = "/recupFavoris")
	public List<FavoriDTO> recupAllFavori() {
		return service.recupAllFavori();
	}
	
	@GetMapping(value = "/recupFavori")
	public FavoriDTO recupFavori(int id) {
		return service.recupFavori(id);
	}
	
	@PostMapping(value = "/ajoutFavori")
	public void AjoutFavori(FavoriDTO f) {
		service.ajoutFavori(f);
	}
	
	
}