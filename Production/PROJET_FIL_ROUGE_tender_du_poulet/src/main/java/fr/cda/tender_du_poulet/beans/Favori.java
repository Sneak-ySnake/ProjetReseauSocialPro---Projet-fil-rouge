package fr.cda.tender_du_poulet.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="favori")
public class Favori {

	@Id
	@Embedded
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	private FavoriId favoriId;

	public Favori(FavoriId favoriId) {
		 this.favoriId = favoriId;
	}
	
	public Favori() {
		
	}

	public FavoriId getFavoriId() {
		return favoriId;
	}

	public void setFavoriId(FavoriId favoriId) {
		this.favoriId = favoriId;
	} 
	
	
}
