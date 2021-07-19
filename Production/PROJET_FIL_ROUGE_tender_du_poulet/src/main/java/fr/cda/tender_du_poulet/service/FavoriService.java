package fr.cda.tender_du_poulet.service;
   
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.dao.FavoriRepository;
import fr.cda.tender_du_poulet.dto.FavoriDTO;
import fr.cda.tender_du_poulet.util.FavoriConverter;

	@Service
	public class FavoriService {
		
		private FavoriConverter favoriconverter = new FavoriConverter();
		
		@Autowired
		FavoriRepository favoriRepository;
		
		public void ajoutFavori(FavoriDTO f) {
			favoriRepository.save(favoriconverter.dtoVersEntity(f));
		}
		
		public FavoriDTO recupFavori(int id) {
			return favoriconverter.entityVersDto(favoriRepository.findById(id).get());
		}
		
		public List<FavoriDTO> recupAllFavori(int id) {
			return favoriconverter.entityVersDto(favoriRepository.findAll());
		}

	}

 