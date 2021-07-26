package fr.cda.tender_du_poulet.dto;

public class NegociationDTO {
	
	private int id_negociation;
	
	private String titre;

	public NegociationDTO() { 
	}
	
	public NegociationDTO(int id_negociation, String titre) {
		 
		this.id_negociation = id_negociation;
		this.titre = titre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getId_negociation() {
		return id_negociation;
	}

	public void setId_negociation(int id_negociation) {
		this.id_negociation = id_negociation;
	}
	
	
	

}
