package fr.cda.tender_du_poulet.dto;

public class FavoriDTO {  
 
	private FavoriIdDTO favoriIdDTO;

	public FavoriDTO() {} 

	public FavoriDTO(FavoriIdDTO favoriIdDTO) {
		 
		this.favoriIdDTO = favoriIdDTO;
	}

	public FavoriIdDTO getFavoriId() {
		return favoriIdDTO;
	}

	public void setFavoriId(FavoriIdDTO favoriIdDTO) {
		this.favoriIdDTO = favoriIdDTO;
	} 
	
	
	
}
