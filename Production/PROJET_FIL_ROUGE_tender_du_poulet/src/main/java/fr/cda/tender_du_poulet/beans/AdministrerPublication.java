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
	private AdministrerPublicationId administrer_publication_id;

	public AdministrerPublication() {
	}

	public AdministrerPublication(AdministrerPublicationId administrer_publication_id) {
		this.administrer_publication_id = administrer_publication_id;

	}
	public AdministrerPublicationId getAdministrer_publication_id() {
		return administrer_publication_id;
	}

	public void setAdministrer_publication_id(AdministrerPublicationId administrer_publication_id) {
		this.administrer_publication_id = administrer_publication_id;
	}
	
}
