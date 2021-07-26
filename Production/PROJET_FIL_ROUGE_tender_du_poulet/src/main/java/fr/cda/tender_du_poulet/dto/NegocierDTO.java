package fr.cda.tender_du_poulet.dto;

import fr.cda.tender_du_poulet.beans.NegocierId;

public class NegocierDTO {
	
	private NegocierId id_negocier;
	 
	private String message;

	public NegocierDTO() {}
	
	public NegocierDTO( String message) {
		this.message = message;
	}

	public NegocierDTO(NegocierId id_negocier, String message) {
		this.id_negocier = id_negocier;
		this.message = message;
	}

	public NegocierId getNegocierid() {
		return id_negocier;
	}

	public void setNegocierid(NegocierId id_negocier) {
		this.id_negocier = id_negocier;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	

}
