package fr.cda.tender_du_poulet.dto;

public class TypePublicationDTO {

	private String nom_type_publication;

	
		///CONSTRUCTEUR///
	
	public TypePublicationDTO(String nom_type_publication) {
		this.nom_type_publication = nom_type_publication;
	}

	public TypePublicationDTO() {
		
	}
	
		///GETTERS SETTERS///

	public String getNom_type_publication() {
		return nom_type_publication;
	}

	public void setNom_type_publication(String nom_type_publication) {
		this.nom_type_publication = nom_type_publication;
	}
	
}
