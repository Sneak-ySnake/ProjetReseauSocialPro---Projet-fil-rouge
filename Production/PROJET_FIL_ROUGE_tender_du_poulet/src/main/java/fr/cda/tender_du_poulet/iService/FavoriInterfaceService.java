package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.dto.FavoriDTO;

public interface FavoriInterfaceService { 
 
		public void ajoutFavori(FavoriDTO f);  
		
		public FavoriDTO recupFavori(int id);
		
		public List<FavoriDTO> recupAllFavori();  
	  
}
