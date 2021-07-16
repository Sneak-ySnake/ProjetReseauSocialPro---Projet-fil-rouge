package fr.cda.tender_du_poulet.dto;

public class ActionSurUtilisateurDTO {
	
	private int id_action_sur_utilisateur;
	private String nom_action_sur_utilisateur;
	
		/// CONSTRUCTEUR ///
	
	public ActionSurUtilisateurDTO() {	
	}
	
	public ActionSurUtilisateurDTO (String nom_action_sur_utilisateur) {
		this.nom_action_sur_utilisateur = nom_action_sur_utilisateur;
	}
	
	public ActionSurUtilisateurDTO(int id_action_sur_utilisateur) {
		this.id_action_sur_utilisateur = id_action_sur_utilisateur;
	}
		
		 /// GETTER ET SETTER ///
	
	public int getId_action_sur_utilisateur() {
		return id_action_sur_utilisateur;
	}

	public void setId_action_sur_utilisateur(int id_action_sur_utilisateur) {
		this.id_action_sur_utilisateur = id_action_sur_utilisateur;
	}

	public String getNom_action_sur_utilisateur() {
		return nom_action_sur_utilisateur;
	}

	public void setNom_action_sur_utilisateur(String nom_action_sur_utilisateur) {
		this.nom_action_sur_utilisateur = nom_action_sur_utilisateur;
	}

}
