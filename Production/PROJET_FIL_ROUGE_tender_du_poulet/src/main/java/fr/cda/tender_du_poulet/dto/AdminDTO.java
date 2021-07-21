package fr.cda.tender_du_poulet.dto;



public class AdminDTO {
	
	private int id_admin;
	private String compte_admin;
	private String mot_de_passe_admin;
	
		/// constructeur///
	
	public AdminDTO() {
		
	}
	
	public AdminDTO(int id_admin) {
		this.id_admin = id_admin;
	}

	public AdminDTO (String compte_admin, String mot_de_passe_admin) {
		this.compte_admin= compte_admin;
		this.mot_de_passe_admin = mot_de_passe_admin;
	}
	
			///GETTER SETTER///

	public int getId_admin() {
		return id_admin;
	}

	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}

	public String getCompte_admin() {
		return compte_admin;
	}

	public void setCompte_admin(String compte_admin) {
		this.compte_admin = compte_admin;
	}

	public String getMot_de_passe_admin() {
		return mot_de_passe_admin;
	}

	public void setMot_de_passe_admin(String mot_de_passe_admin) {
		this.mot_de_passe_admin = mot_de_passe_admin;
	}
}
