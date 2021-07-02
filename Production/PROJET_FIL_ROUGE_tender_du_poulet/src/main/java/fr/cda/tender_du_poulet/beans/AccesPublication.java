package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccesPublication {

	@Id
	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private AccesPublicationId acces_publication_id;
	
	@Column(name = "accessible")
	private boolean accessible;

	public AccesPublication() {
		
	}
	
	public AccesPublication(AccesPublicationId acces_publication_id, boolean accessible) {
		this.acces_publication_id = acces_publication_id;
		this.accessible = accessible;
	}

	public AccesPublicationId getAcces_publication_id() {
		return acces_publication_id;
	}

	public void setAcces_publication_id(AccesPublicationId acces_publication_id) {
		this.acces_publication_id = acces_publication_id;
	}

	public boolean isAccessible() {
		return accessible;
	}

	public void setAccessible(boolean accessible) {
		this.accessible = accessible;
	}
	
}
