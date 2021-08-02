package fr.cda.tender_du_poulet.dto;

public class FavoriDTO {  
 
	private FavoriIdDTO favoriIdDTO;

	public FavoriDTO() {}  

	public FavoriDTO(FavoriIdDTO favoriIdDTO) {
		 
		this.favoriIdDTO = favoriIdDTO;
	}

	public FavoriIdDTO getFavoriIdDTO() {
		return favoriIdDTO;
	}

	public void setFavoriIdDTO(FavoriIdDTO favoriIdDTO) {
		this.favoriIdDTO = favoriIdDTO;
	} 
	
	
	
}
