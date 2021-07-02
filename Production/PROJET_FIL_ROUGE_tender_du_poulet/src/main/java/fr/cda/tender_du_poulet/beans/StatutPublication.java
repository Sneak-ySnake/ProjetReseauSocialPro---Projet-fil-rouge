package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StatutPublication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_statut_publication")
	private int id_statut_publication;
	
	@Column(name = "nom_statut_publication")
	private String nom_statut_publication;

	public StatutPublication() {
		
	}
	
	public StatutPublication(int id_statut_publication, String nom_statut_publication) {
		this.id_statut_publication = id_statut_publication;
		this.nom_statut_publication = nom_statut_publication;
	}

	public int getId_statut_publication() {
		return id_statut_publication;
	}

	public void setId_statut_publication(int id_statut_publication) {
		this.id_statut_publication = id_statut_publication;
	}

	public String getNom_statut_publication() {
		return nom_statut_publication;
	}

	public void setNom_statut_publication(String nom_statut_publication) {
		this.nom_statut_publication = nom_statut_publication;
	}
	
}
