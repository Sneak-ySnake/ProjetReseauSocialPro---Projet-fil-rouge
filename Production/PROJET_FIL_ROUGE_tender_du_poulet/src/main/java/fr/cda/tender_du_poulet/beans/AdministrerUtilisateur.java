package fr.cda.tender_du_poulet.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrer_utilisateur")
public class AdministrerUtilisateur {

	@Id
	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private AdministrerUtilisateurId administrer_utilisateur_id;

	public AdministrerUtilisateur() {
	}

	public AdministrerUtilisateur(AdministrerUtilisateurId administrer_utilisateur_id) {
		this.administrer_utilisateur_id = administrer_utilisateur_id;
	}
	////// GETTER et SETTER /////

	public AdministrerUtilisateurId getAdministrer_utilisateur_id() {
		return administrer_utilisateur_id;
	}

	public void setAdministrer_utilisateur_id(AdministrerUtilisateurId administrer_utilisateur_id) {
		this.administrer_utilisateur_id = administrer_utilisateur_id;
	}
	
}
