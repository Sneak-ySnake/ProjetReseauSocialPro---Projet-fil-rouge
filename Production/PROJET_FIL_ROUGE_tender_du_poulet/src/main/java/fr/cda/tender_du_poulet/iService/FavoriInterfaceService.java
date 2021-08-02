package fr.cda.tender_du_poulet.iService;

import java.util.List;

import fr.cda.tender_du_poulet.beans.FavoriId;
import fr.cda.tender_du_poulet.dto.FavoriDTO;

public interface FavoriInterfaceService { 
 
		public void ajoutFavori(FavoriDTO f);  
		
		public FavoriDTO recupFavori(FavoriId id);
		
		public List<FavoriDTO> recupAllFavori(); 
		
		public void supprimerFavori(FavoriId id);
		
		public void modifFavori(FavoriDTO f);
	  
}
