package fr.cda.tender_du_poulet.dto;

public class StatutPublicationDTO {

	private String nom_statut_publication;

	
		///CONSTRUCTEUR///
	public StatutPublicationDTO() {
		
	}
	
	public StatutPublicationDTO(String nom_statut_publication) {
		this.nom_statut_publication = nom_statut_publication;
	}

	
		///GETTERS SETTERS///

	public String getNom_statut_publication() {
		return nom_statut_publication;
	}

	public void setNom_statut_publication(String nom_statut_publication) {
		this.nom_statut_publication = nom_statut_publication;
	}
	
}
