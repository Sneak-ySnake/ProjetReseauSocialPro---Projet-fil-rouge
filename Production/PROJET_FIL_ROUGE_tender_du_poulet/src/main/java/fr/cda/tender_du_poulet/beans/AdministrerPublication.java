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
	private AdministrerPublicationId administrer_publicationId;

	public AdministrerPublication() {
	}

	public AdministrerPublication(AdministrerPublicationId administrer_publicationId) {
		this.administrer_publicationId = administrer_publicationId;

	}
	public AdministrerPublicationId getAdministrer_publicationId() {
		return administrer_publicationId;
	}

	public void setAdministrer_publicationId(AdministrerPublicationId administrer_publicationId) {
		this.administrer_publicationId = administrer_publicationId;
	}
	
}
