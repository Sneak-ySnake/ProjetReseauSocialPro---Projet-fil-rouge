package fr.cda.tender_du_poulet.dto;

public class NegocierDTO {
	
	private NegocierIdDTO id_negocier;
	 
	private String message;

	public NegocierDTO() {
		
	}

	public NegocierDTO(NegocierIdDTO id_negocier, String message) {
		 
		this.id_negocier = id_negocier;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setId_negocier(NegocierIdDTO id_negocier) {
		this.id_negocier = id_negocier;
	}
	
	public NegocierIdDTO getId_negocier() {
		return id_negocier;
	}
	
}
