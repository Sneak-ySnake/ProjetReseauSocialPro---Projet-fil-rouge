package fr.cda.tender_du_poulet.dto;

import fr.cda.tender_du_poulet.beans.NegocierId;

public class NegocierDTO {
	
	private NegocierId negocierid;
	 
	private String message;

	public NegocierDTO() {}
	
	public NegocierDTO( String message) {
		this.message = message;
	}

	public NegocierDTO(NegocierId negocierid, String message) {
		this.negocierid = negocierid;
		this.message = message;
	}

	public NegocierId getNegocierid() {
		return negocierid;
	}

	public void setNegocierid(NegocierId negocierid) {
		this.negocierid = negocierid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	

}
