package fr.cda.tender_du_poulet.dto;

public class NegocierDTO {
	
	private NegocierIdDTO id_negocier;
	 
	private String message;

	public NegocierIdDTO getId_negocier() {
		return id_negocier;
	}

	public void setId_negocier(NegocierIdDTO id_negocier) {
		this.id_negocier = id_negocier;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
