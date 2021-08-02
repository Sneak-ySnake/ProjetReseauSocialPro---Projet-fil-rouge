package fr.cda.tender_du_poulet.service;
   
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.beans.FavoriId;
import fr.cda.tender_du_poulet.dao.FavoriRepository;
import fr.cda.tender_du_poulet.dto.FavoriDTO;
import fr.cda.tender_du_poulet.iService.FavoriInterfaceService;
import fr.cda.tender_du_poulet.util.FavoriConverter;

	@Service
	public class FavoriService implements FavoriInterfaceService  {
		
		private FavoriConverter favoriConverter = new FavoriConverter();
		
		@Autowired
		FavoriRepository favoriRepository;
		 

		@Override
		public void ajoutFavori(FavoriDTO f) {
			favoriRepository.save(favoriConverter.dtoVersEntity(f));
			
		}

		@Override
		public FavoriDTO recupFavori(FavoriId id) {
			return favoriConverter.entityVersDto(favoriRepository.findById(id).get());
			 
		}

		@Override
		public List<FavoriDTO> recupAllFavori() {
			return favoriConverter.entityVersDto(favoriRepository.findAll());
		 
		}

		  
		public void supprimerFavori(FavoriId id) {
			favoriRepository.deleteById(id);
		}
		
		public void modifFavori(FavoriDTO n) {
			favoriRepository.save(favoriConverter.dtoVersEntity(n));
		}

	}

 