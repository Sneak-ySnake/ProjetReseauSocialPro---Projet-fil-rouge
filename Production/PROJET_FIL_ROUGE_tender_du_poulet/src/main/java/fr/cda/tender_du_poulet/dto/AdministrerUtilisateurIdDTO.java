package fr.cda.tender_du_poulet.dto;

import java.util.Date;

public class AdministrerUtilisateurIdDTO {
	
	private AdminDTO admin;
	private ActionSurUtilisateurDTO action_sur_utilisateur;
	private UtilisateurDTO utilisateur;
	private Date date_action_sur_utilisateur;
	
	
	////////constructeur //////
	
	public AdministrerUtilisateurIdDTO() {
	}
	
	public AdministrerUtilisateurIdDTO (AdminDTO admin, ActionSurUtilisateurDTO action_sur_utilisateur,
			UtilisateurDTO utilisateur,Date date_action_sur_utilisateur){
		this.admin = admin;
		this.action_sur_utilisateur = action_sur_utilisateur;
		this.utilisateur = utilisateur;
		this.date_action_sur_utilisateur = date_action_sur_utilisateur;
	}

	//// Getter et setter///////
	
	public AdminDTO getAdmin() {
		return admin;
	}

	public void setAdmin(AdminDTO admin) {
		this.admin = admin;
	}

	public ActionSurUtilisateurDTO getAction_sur_utilisateur() {
		return action_sur_utilisateur;
	}

	public void setAction_sur_utilisateur(ActionSurUtilisateurDTO action_sur_utilisateur) {
		this.action_sur_utilisateur = action_sur_utilisateur;
	}

	public UtilisateurDTO getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurDTO utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getDate_action_sur_utilisateur() {
		return date_action_sur_utilisateur;
	}

	public void setDate_action_sur_utilisateur(Date date_action_sur_utilisateur) {
		this.date_action_sur_utilisateur = date_action_sur_utilisateur;
	}

}
