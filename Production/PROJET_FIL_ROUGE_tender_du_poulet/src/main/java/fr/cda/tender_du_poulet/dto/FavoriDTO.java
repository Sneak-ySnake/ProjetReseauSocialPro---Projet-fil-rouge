package fr.cda.tender_du_poulet.dto;
 
import fr.cda.tender_du_poulet.beans.FavoriId;

public class FavoriDTO { 
 
		private FavoriId favoriId;
		
		public FavoriDTO() {		
		}
		public FavoriDTO(FavoriId favoriId) {
			 this.favoriId = favoriId;
		}

		public FavoriId getFavoriId() {
			return favoriId;
		}

		public void setFavoriId(FavoriId favoriId) {
			this.favoriId = favoriId;
		} 
	 
	
}
