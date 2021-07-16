package fr.cda.tender_du_poulet.dto;

public class AdministrerUtilisateurDTO {
	
	private AdministrerUtilisateurIdDTO administrer_utilisateurId;
	
	 	/// CONSTRUCTEUR ///

	public AdministrerUtilisateurDTO() {
	}

	public AdministrerUtilisateurDTO(AdministrerUtilisateurIdDTO administrer_utilisateurId) {
		this.administrer_utilisateurId = administrer_utilisateurId;
	}
	
	public AdministrerUtilisateurIdDTO getAdministrerUtilisateurId() {
		return administrer_utilisateurId;
	}
	
		/// GETTER ET SETTER ///

	public void setAdministrerUtilisateurId(AdministrerUtilisateurIdDTO administrer_utilisateurId) {
		this.administrer_utilisateurId = administrer_utilisateurId;
	}

}
