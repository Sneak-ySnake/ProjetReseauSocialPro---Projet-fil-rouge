package fr.cda.tender_du_poulet.dto;

public class ActionSurPublicationDTO {
	
	private int id_action_sur_publication;
	private String nom_action_sur_publication;
	
		/// CONSTRUCTEUR ///
	
	public ActionSurPublicationDTO() {	
	}
	
	public ActionSurPublicationDTO(String nom_action_sur_publication) {
		this.nom_action_sur_publication = nom_action_sur_publication;
	}
	
	public ActionSurPublicationDTO(int id_action_sur_publication) {
		this.id_action_sur_publication = id_action_sur_publication;
	}
	
		/// GETTER ET SETTER ///

	public int getId_action_sur_publication() {
		return id_action_sur_publication;
	}

	public void setId_action_sur_publication(int id_action_sur_publication) {
		this.id_action_sur_publication = id_action_sur_publication;
	}

	public String getNom_action_sur_publication() {
		return nom_action_sur_publication;
	}

	public void setNom_action_sur_publication(String nom_action_sur_publication) {
		this.nom_action_sur_publication = nom_action_sur_publication;
	}
	

}
