package fr.cda.tender_du_poulet.dto;

public class NegociationDTO {
	
	private int id_negociation;

	
	public NegociationDTO() { 
	} 
	
	public NegociationDTO(int id_negociation) {
		 
		this.id_negociation = id_negociation;
	}

	public int getId_negociation() {
		return id_negociation;
	}

	public void setId_negociation(int id_negociation) {
		this.id_negociation = id_negociation;
	}

}
