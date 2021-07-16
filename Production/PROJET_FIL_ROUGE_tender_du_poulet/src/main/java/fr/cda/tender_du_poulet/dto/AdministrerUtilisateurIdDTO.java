package fr.cda.tender_du_poulet.dto;

import java.util.Date;
import fr.cda.tender_du_poulet.beans.ActionSurUtilisateur;
import fr.cda.tender_du_poulet.beans.Admin;
import fr.cda.tender_du_poulet.beans.Utilisateur;

public class AdministrerUtilisateurIdDTO {
	
	private AdminDTO admin;
	private ActionSurUtilisateurDTO action_sur_utillisateur;
	private UtilisateurDTO utilisateur;
	private Date date_action_sur_utilisateur;
	
	public AdministrerUtilisateurIdDTO() {
		
	}
	
	public AdministrerUtilisateurIdDTO (AdminDTO admin, ActionSurUtilisateurDTO action_sur_utillisateur,
			UtilisateurDTO utilisateur,Date date_action_sur_utilisateur){
		this.admin=admin;
		this.action_sur_utillisateur = action_sur_utillisateur;
		this.utilisateur = utilisateur;
		this.date_action_sur_utilisateur = date_action_sur_utilisateur;
	}

	public AdminDTO getAdmin() {
		return admin;
	}

	public void setAdmin(AdminDTO admin) {
		this.admin = admin;
	}

	public ActionSurUtilisateurDTO getAction_sur_utillisateur() {
		return action_sur_utillisateur;
	}

	public void setAction_sur_utillisateur(ActionSurUtilisateurDTO action_sur_utillisateur) {
		this.action_sur_utillisateur = action_sur_utillisateur;
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
