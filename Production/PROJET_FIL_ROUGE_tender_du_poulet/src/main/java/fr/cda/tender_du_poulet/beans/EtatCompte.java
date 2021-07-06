package fr.cda.tender_du_poulet.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="etat_compte")
public class EtatCompte {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_etat_compte;
	private String nom_etat_compte;
	private int duree;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public EtatCompte() {
	}

	public EtatCompte(String nom_etat_compte, int duree) {
		this.nom_etat_compte = nom_etat_compte;
		this.duree = duree;
	}
	
	
/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public int getId_etat_compte() {
		return id_etat_compte;
	}
	public void setId_etat_compte(int id_etat_compte) {
		this.id_etat_compte = id_etat_compte;
	}

	public String getNom_etat_compte() {
		return nom_etat_compte;
	}
	public void setNom_etat_compte(String nom_etat_compte) {
		this.nom_etat_compte = nom_etat_compte;
	}

	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
}
