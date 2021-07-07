package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etat_publication")
public class EtatPublication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_etat_publication")
	private int id_etat_publication;
	
	@Column(name = "nom_etat_publication")
	private String nom_etat_publication;
	
		
		///CONSTRUCTEUR///
	
	public EtatPublication() {
		
	}
	
	public EtatPublication(String nom_etat_publication) {
		this.nom_etat_publication = nom_etat_publication;
	}

	
		///GETTER SETTER///
	
	public int getId_etat_publication() {
		return id_etat_publication;
	}

	public void setId_etat_publication(int id_etat_publication) {
		this.id_etat_publication = id_etat_publication;
	}

	public String getNom_etat_publication() {
		return nom_etat_publication;
	}

	public void setNom_etat_publication(String nom_etat_publication) {
		this.nom_etat_publication = nom_etat_publication;
	}
	
}
