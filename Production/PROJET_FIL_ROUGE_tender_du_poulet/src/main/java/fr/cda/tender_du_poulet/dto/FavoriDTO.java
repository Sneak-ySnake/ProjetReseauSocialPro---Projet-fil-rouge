package fr.cda.tender_du_poulet.dto;

public class FavoriDTO {  
 
	private FavoriIdDTO id_favori;

	public FavoriDTO() {		
		
	}
		
	public FavoriDTO(FavoriIdDTO id_favori) {
		
		this.id_favori = id_favori;
	}

	public FavoriIdDTO getId_favori() {
		return id_favori;
	}

	public void setId_favori(FavoriIdDTO id_favori) {
		this.id_favori = id_favori;
	}
	

	
	 
	
	
	
}
