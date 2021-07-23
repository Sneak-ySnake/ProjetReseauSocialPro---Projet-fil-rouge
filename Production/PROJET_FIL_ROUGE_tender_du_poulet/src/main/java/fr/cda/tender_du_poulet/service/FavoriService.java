package fr.cda.tender_du_poulet.service;
   
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.tender_du_poulet.beans.FavoriId;
import fr.cda.tender_du_poulet.dao.FavoriRepository;
import fr.cda.tender_du_poulet.dto.FavoriDTO;
import fr.cda.tender_du_poulet.dto.FavoriIdDTO;
import fr.cda.tender_du_poulet.iService.FavoriInterfaceService;
import fr.cda.tender_du_poulet.util.FavoriConverter;

	@Service
	public class FavoriService implements FavoriInterfaceService  {
		
		private FavoriConverter favoriconverter = new FavoriConverter();
		
		@Autowired
		FavoriRepository favoriRepository;
		 

		@Override
		public void ajoutFavori(FavoriDTO f) {
			favoriRepository.save(favoriconverter.dtoVersEntity(f));
			
		}

		@Override
		public FavoriDTO recupFavori(FavoriId id) {
			return favoriconverter.entityVersDto(favoriRepository.findById(id).get());
			 
		}

		@Override
		public List<FavoriDTO> recupAllFavori() {
			return favoriconverter.entityVersDto(favoriRepository.findAll());
		 
		}

		 

	}

 