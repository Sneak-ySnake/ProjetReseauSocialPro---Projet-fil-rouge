package fr.cda.tender_du_poulet.dto;

public class StatutPublicationDTO {

	private int id_statut_publication;
	
	private String nom_statut_publication;

	
		///CONSTRUCTEUR///
	public StatutPublicationDTO() {
		
	}
	
		///GETTERS SETTERS///

	public String getNom_statut_publication() {
		return nom_statut_publication;
	}

	public void setNom_statut_publication(String nom_statut_publication) {
		this.nom_statut_publication = nom_statut_publication;
	}
	
}
