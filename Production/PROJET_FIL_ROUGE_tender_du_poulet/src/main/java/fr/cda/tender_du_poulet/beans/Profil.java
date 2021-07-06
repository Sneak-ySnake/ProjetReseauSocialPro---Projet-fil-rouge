package fr.cda.tender_du_poulet.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="profil")
public class Profil {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_profil;
	private String nom_profil;

	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public Profil() {
	}

	public Profil(String nom_profil) {
		this.nom_profil = nom_profil;
	}
	

/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public int getId_profil() {
		return id_profil;
	}
	public void setId_profil(int id_profil) {
		this.id_profil = id_profil;
	}

	public String getNom_profil() {
		return nom_profil;
	}
	public void setNom_profil(String nom_profil) {
		this.nom_profil = nom_profil;
	}
}
