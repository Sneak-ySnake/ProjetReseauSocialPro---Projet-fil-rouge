package fr.cda.tender_du_poulet.dto;

public class PaysDTO {

	private int id_pays;

	private String nom_pays;
	
	
		////CONSTRUCTEUR////
	public PaysDTO() {
		
	}


	
	
		////GETTERS SETTERS////
	public int getId_pays() {
		return id_pays;
	}


	public void setId_pays(int id_pays) {
		this.id_pays = id_pays;
	}


	public String getNom_pays() {
		return nom_pays;
	}


	public void setNom_pays(String nom_pays) {
		this.nom_pays = nom_pays;
	}
	
}
