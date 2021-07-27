package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pays")
public class Pays {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_pays")
	private int id_pays;
	
	@Column(name = "nom_pays")
	private String nom_pays;
	
	
		////CONSTRUCTEUR////
	public Pays() {
		
	}

	
	
		////GETTERS SETTERS////
	public Pays(String nom_pays) {
		this.nom_pays = nom_pays;
	}

	public int getId_pays() {
		return id_pays;
	}

	public void setId_pays(int id_pays) {
		this.id_pays = id_pays;
	}

	public String getNom_pays() {
		return nom_pays;
	}

	public void setNom_pays(String nom_pays) {
		this.nom_pays = nom_pays;
	}

}
