package fr.cda.tender_du_poulet.dto;

public class DomaineDTO {
	private int id_domaine;
	private String nom_domaine;
	
	
/////////////////////////////// CONSTRUCTEUR ///////////////////////////////////////////////////////////////////////////
	public DomaineDTO(String nom_domaine) {
		this.nom_domaine = nom_domaine;
	}


/////////////////////////////// GETTER / SETTER ///////////////////////////////////////////////////////////////////////////
	public int getId_domaine() {
		return id_domaine;
	} 
	public void setId_domaine(int id_domaine) {
		this.id_domaine = id_domaine;
	}

	public String getNom_domaine() {
		return nom_domaine;
	}
	public void setNom_domaine(String nom_domaine) {
		this.nom_domaine = nom_domaine;
	}
}
