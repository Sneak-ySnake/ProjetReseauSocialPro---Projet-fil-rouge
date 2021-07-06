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
	private AdministrerUtilisateurId administrer_utilisateurId;

	public AdministrerUtilisateur() {
	}

	public AdministrerUtilisateur(AdministrerUtilisateurId administrer_utilisateurId) {
		this.administrer_utilisateurId = administrer_utilisateurId;
	}
	
	public AdministrerUtilisateurId getAdministrerUtilisateurId() {
		return administrer_utilisateurId;
	}

	public void setAdministrerUtilisateurId(AdministrerUtilisateurId administrer_utilisateurId) {
		this.administrer_utilisateurId = administrer_utilisateurId;
	}
}
