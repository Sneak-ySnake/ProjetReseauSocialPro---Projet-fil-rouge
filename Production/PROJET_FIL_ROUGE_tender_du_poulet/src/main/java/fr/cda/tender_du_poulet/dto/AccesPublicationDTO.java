package fr.cda.tender_du_poulet.dto;

import fr.cda.tender_du_poulet.beans.AccesPublicationId;

public class AccesPublicationDTO {
	
	private AccesPublicationIdDTO acces_publication_id;
	
	private boolean accessible;
		
		///CONSTRUCTEUR///
	public AccesPublicationDTO() {
		
	}

		///GETTER SETTER///
	public boolean isAccessible() {
		return accessible;
	}

	public AccesPublicationIdDTO getAcces_publication_id() {
		return acces_publication_id;
	}

	public void setAcces_publication_id(AccesPublicationIdDTO acces_publication_id) {
		this.acces_publication_id = acces_publication_id;
	}

	public void setAccessible(boolean accessible) {
		this.accessible = accessible;
	}
	
}
