package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.FavoriDTO;

public interface FavoriInterfaceService {
 
 
		public void ajoutFavori();  
		
		public FavoriDTO recupFavori();
		
		public List<FavoriDTO> recupAllFavori(); 
		
	  
}
