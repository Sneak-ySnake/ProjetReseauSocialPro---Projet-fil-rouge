package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.FavoriId;
import fr.cda.tender_du_poulet.dto.FavoriDTO;

public interface FavoriInterfaceService { 
 
		public void addFavori(FavoriDTO f);  
		
		public FavoriDTO findFavori(FavoriId id);
		
		public List<FavoriDTO> findAllFavori(); 
		
		public void deleteFavori(FavoriId id);
		
		public void updateFavori(FavoriDTO f);
	  
}
