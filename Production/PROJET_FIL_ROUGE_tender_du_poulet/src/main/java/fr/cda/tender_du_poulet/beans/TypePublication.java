package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypePublication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_type_publication")
	private int id_type_publication;
	
	@Column(name = "nom_type_publication")
	private String nom_type_publication;

	public TypePublication() {
		
	}
	
	public TypePublication(int id_type_publication, String nom_type_publication) {
		this.id_type_publication = id_type_publication;
		this.nom_type_publication = nom_type_publication;
	}

	public int getId_type_publication() {
		return id_type_publication;
	}

	public void setId_type_publication(int id_type_publication) {
		this.id_type_publication = id_type_publication;
	}

	public String getNom_type_publication() {
		return nom_type_publication;
	}

	public void setNom_type_publication(String nom_type_publication) {
		this.nom_type_publication = nom_type_publication;
	}
	
}
