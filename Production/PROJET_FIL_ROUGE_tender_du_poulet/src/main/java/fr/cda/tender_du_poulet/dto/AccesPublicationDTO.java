package fr.cda.tender_du_poulet.dto;

import fr.cda.tender_du_poulet.beans.AccesPublicationId;

public class AccesPublicationDTO {
	
	private boolean accessible;

		
		///CONSTRUCTEUR///
	public AccesPublicationDTO() {
		
	}

	public AccesPublicationDTO(AccesPublicationId acces_publication_id, boolean accessible) {
		this.accessible = accessible;
	}

	
		///GETTER SETTER///
	public boolean isAccessible() {
		return accessible;
	}

	public void setAccessible(boolean accessible) {
		this.accessible = accessible;
	}
	
}
