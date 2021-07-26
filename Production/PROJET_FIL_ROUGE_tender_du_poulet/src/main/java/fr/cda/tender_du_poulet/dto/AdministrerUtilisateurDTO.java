package fr.cda.tender_du_poulet.dto;

public class AdministrerUtilisateurDTO {
	
	private AdministrerUtilisateurIdDTO administrer_utilisateur_id;
	
	 	/// CONSTRUCTEUR ///

	public AdministrerUtilisateurDTO() {
	}

	public AdministrerUtilisateurDTO(AdministrerUtilisateurIdDTO administrer_utilisateur_id) {
		this.administrer_utilisateur_id = administrer_utilisateur_id;
	}
	/// GETTER ET SETTER ///
	
	public AdministrerUtilisateurIdDTO getAdministrer_utilisateur_id() {
		return administrer_utilisateur_id;
	}
	
	public void setAdministrer_utilisateur_id(AdministrerUtilisateurIdDTO administrer_utilisateur_id) {
		this.administrer_utilisateur_id = administrer_utilisateur_id;
	}

}
