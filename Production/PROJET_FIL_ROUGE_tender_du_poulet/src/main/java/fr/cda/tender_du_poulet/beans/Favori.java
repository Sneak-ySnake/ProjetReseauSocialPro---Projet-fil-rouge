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
	private FavoriId id_favori;

	public Favori() {
		
	}
	public Favori(FavoriId id_favori) {
		this.id_favori = id_favori;
	}
	public FavoriId getId_favori() {
		return id_favori;
	}
	public void setId_favori(FavoriId id_favori) {
		this.id_favori = id_favori;
	}
	
	
}
