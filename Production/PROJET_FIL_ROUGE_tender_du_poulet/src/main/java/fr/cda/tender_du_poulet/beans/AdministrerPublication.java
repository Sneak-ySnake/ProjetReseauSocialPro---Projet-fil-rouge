package fr.cda.tender_du_poulet.beans;



import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrer_publication")
public class AdministrerPublication {

	@Id
	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private AdministrerPublicationId administrerPublicationId;

	public AdministrerPublication() {
	}

	public AdministrerPublication(AdministrerPublicationId administrerPublicationId) {
		this.administrerPublicationId = administrerPublicationId;

	}
	
	public AdministrerPublicationId getAdministrerPublicationId() {
		return administrerPublicationId;
	}

	public void setAdministrerUtilisateurId(AdministrerPublicationId administrerPublicationId) {
		this.administrerPublicationId = administrerPublicationId;
	}
}
