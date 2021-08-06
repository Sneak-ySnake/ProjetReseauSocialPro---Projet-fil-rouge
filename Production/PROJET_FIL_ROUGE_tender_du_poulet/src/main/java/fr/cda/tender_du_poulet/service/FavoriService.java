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
		public void addFavori(FavoriDTO f) {
			favoriRepository.save(favoriConverter.dtoVersEntity(f));
			
		}

		@Override
		public FavoriDTO findFavori(FavoriId id) {
			return favoriConverter.entityVersDto(favoriRepository.findById(id).get());
			 
		}

		@Override
		public List<FavoriDTO> findAllFavori() {
			return favoriConverter.entityVersDto(favoriRepository.findAll());
		 
		}

		  
		public void deleteFavori(FavoriId id) {
			favoriRepository.deleteById(id);
		}
		
		public void updateFavori(FavoriDTO n) {
			favoriRepository.save(favoriConverter.dtoVersEntity(n));
		}

	}

 