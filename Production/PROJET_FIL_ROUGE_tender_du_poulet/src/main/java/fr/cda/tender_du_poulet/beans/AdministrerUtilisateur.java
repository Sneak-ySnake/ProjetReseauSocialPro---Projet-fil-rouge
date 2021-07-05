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
	private AdministrerUtilisateurId administrerUtilisateurId;

	public AdministrerUtilisateur() {
	}

	public AdministrerUtilisateur(AdministrerUtilisateurId administrerUtilisateurId) {
		this.administrerUtilisateurId = administrerUtilisateurId;

	}
	
	public AdministrerUtilisateurId getAdministrerUtilisateurId() {
		return administrerUtilisateurId;
	}

	public void setAdministrerUtilisateurId(AdministrerUtilisateurId administrerUtilisateurId) {
		this.administrerUtilisateurId = administrerUtilisateurId;
	}
}
