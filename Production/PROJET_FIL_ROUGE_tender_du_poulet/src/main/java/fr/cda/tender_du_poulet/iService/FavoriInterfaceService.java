package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.FavoriId;
import fr.cda.tender_du_poulet.dto.FavoriDTO;
import fr.cda.tender_du_poulet.dto.FavoriIdDTO;

public interface FavoriInterfaceService { 
 
		public void ajoutFavori(FavoriDTO f);  
		
		public FavoriDTO recupFavori(FavoriId id);
		
		public List<FavoriDTO> recupAllFavori();  
	  
}
