package fr.cda.tender_du_poulet.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class AdministrerUtilisateurId implements Serializable {
	
	@ManyToOne() @JoinColumn(name="id_admin")
	private Admin admin;
	@ManyToOne() @JoinColumn(name="id_action_sur_utilisateur")
	private ActionSurUtilisateur action_sur_utilisateur;
	@ManyToOne() @JoinColumn(name ="id_utilisateur")
	private Utilisateur utilisateur;
	@JoinColumn (name ="date_action_sur_utilisateur")
	private Date date_action_sur_utilisateur;
	
	public AdministrerUtilisateurId() {
		
	}
	
	public AdministrerUtilisateurId (Admin admin, ActionSurUtilisateur action_sur_utilisateur,
			Utilisateur utilisateur,Date date_action_sur_utilisateur){
		this.admin = admin;
		this.action_sur_utilisateur = action_sur_utilisateur;
		this.utilisateur = utilisateur;
		this.date_action_sur_utilisateur = date_action_sur_utilisateur;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public ActionSurUtilisateur getAction_sur_utillisateur() {
		return action_sur_utilisateur;
	}

	public void setAction_sur_utillisateur(ActionSurUtilisateur action_sur_utilisateur) {
		this.action_sur_utilisateur = action_sur_utilisateur;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getDate_action_sur_utilisateur() {
		return date_action_sur_utilisateur;
	}

	public void setDate_action_sur_utilisateur(Date date_action_sur_utilisateur) {
		this.date_action_sur_utilisateur = date_action_sur_utilisateur;
	}

}
