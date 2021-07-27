package fr.cda.tender_du_poulet.dto;

public class VilleDTO {

	private int id_ville;

	private String nom_ville;

	private String code_postal;

	private PaysDTO pays;
	
	
		////CONSTRUCTEUR////
	public VilleDTO() {
		
	}

	
	
		////GETTERS SETTERS////
	public int getId_ville() {
		return id_ville;
	}

	public void setId_ville(int id_ville) {
		this.id_ville = id_ville;
	}

	public String getNom_ville() {
		return nom_ville;
	}

	public void setNom_ville(String nom_ville) {
		this.nom_ville = nom_ville;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public PaysDTO getPays() {
		return pays;
	}

	public void setPays(PaysDTO pays) {
		this.pays = pays;
	}
	
}
