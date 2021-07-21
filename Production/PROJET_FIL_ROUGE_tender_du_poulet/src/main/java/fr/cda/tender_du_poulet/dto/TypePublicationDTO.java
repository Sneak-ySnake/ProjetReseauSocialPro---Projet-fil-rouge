package fr.cda.tender_du_poulet.dto;

public class TypePublicationDTO {

	private int id_type_publication;
	
	private String nom_type_publication;

	
		///CONSTRUCTEUR///
	public TypePublicationDTO() {
		
	}
	
		///GETTERS SETTERS///
	
	public String getNom_type_publication() {
		return nom_type_publication;
	}

	public int getId_type_publication() {
		return id_type_publication;
	}

	public void setId_type_publication(int id_type_publication) {
		this.id_type_publication = id_type_publication;
	}

	public void setNom_type_publication(String nom_type_publication) {
		this.nom_type_publication = nom_type_publication;
	}
	
}
