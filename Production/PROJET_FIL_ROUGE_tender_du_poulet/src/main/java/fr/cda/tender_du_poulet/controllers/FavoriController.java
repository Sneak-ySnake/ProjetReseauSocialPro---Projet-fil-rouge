package fr.cda.tender_du_poulet.controllers;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.tender_du_poulet.beans.FavoriId;
import fr.cda.tender_du_poulet.dto.FavoriDTO;
import fr.cda.tender_du_poulet.service.FavoriService;

@RestController
public class FavoriController {

	@Autowired
	private FavoriService favoriService = new FavoriService();
	
	@GetMapping(value = "/findAllFavori")
	public List<FavoriDTO> findAllFavori() {
		return favoriService.findAllFavori();
	}
	
	@GetMapping(value = "/findFavori")
	public FavoriDTO findFavori(@RequestBody FavoriId id) {
		return favoriService.findFavori(id);
	}
	
	@PostMapping(value = "/addFavori")
	public void addFavori(@RequestBody FavoriDTO f) {
		favoriService.addFavori(f);
	}
	
	@PostMapping(value = "/deleteFavori")
	public void deleteFavori(@RequestBody FavoriId id) {
		favoriService.deleteFavori(id);
	}
	
	@PostMapping(value = "/updateFavori")
	public void updateFavori(@RequestBody FavoriDTO f) {
		favoriService.updateFavori(f);
	}
	
	
}
