package fr.cda.tender_du_poulet.dto;



public class AdminDTO {
	
	private int id_admin;
	private String mail_admin;
	private String mot_de_passe_admin;
	private String num_adresse_admin; 
	private String intitule_adresse_admin;
	private String codePostal_admin; 
	private String ville_admin; 
	private String pays_admin; 
	private String complement_adresse_admin;
	
		/// constructeur///
	
	public AdminDTO() {
	}
	
	public AdminDTO(int id_admin) {
		this.id_admin = id_admin;
	}
	
	public AdminDTO (String mail_admin, String mot_de_passe_admin,String num_adresse_admin, String intitule_adresse_admin,
			String codePostal_admin, String ville_admin, String pays_admin, String complement_adresse_admin) {
		this.mail_admin= mail_admin;
		this.mot_de_passe_admin = mot_de_passe_admin;
		this.num_adresse_admin = num_adresse_admin;
		this.intitule_adresse_admin = intitule_adresse_admin;
		this.codePostal_admin =codePostal_admin;
		this.ville_admin = ville_admin;
		this.pays_admin = pays_admin;
		this.complement_adresse_admin = complement_adresse_admin;
	}
			///GETTER et SETTER///

	public int getId_admin() {
		return id_admin;
	}

	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}

	public String getMail_admin() {
		return mail_admin;
	}

	public void setMail_admin(String mail_admin) {
		this.mail_admin = mail_admin;
	}

	public String getMot_de_passe_admin() {
		return mot_de_passe_admin;
	}

	public void setMot_de_passe_admin(String mot_de_passe_admin) {
		this.mot_de_passe_admin = mot_de_passe_admin;
	}

	public String getNum_adresse_admin() {
		return num_adresse_admin;
	}

	public void setNum_adresse_admin(String num_adresse_admin) {
		this.num_adresse_admin = num_adresse_admin;
	}

	public String getIntitule_adresse_admin() {
		return intitule_adresse_admin;
	}

	public void setIntitule_adresse_admin(String intitule_adresse_admin) {
		this.intitule_adresse_admin = intitule_adresse_admin;
	}

	public String getCodePostal_admin() {
		return codePostal_admin;
	}

	public void setCodePostal_admin(String codePostal_admin) {
		this.codePostal_admin = codePostal_admin;
	}

	public String getVille_admin() {
		return ville_admin;
	}

	public void setVille_admin(String ville_admin) {
		this.ville_admin = ville_admin;
	}

	public String getPays_admin() {
		return pays_admin;
	}

	public void setPays_admin(String pays_admin) {
		this.pays_admin = pays_admin;
	}

	public String getComplement_adresse_admin() {
		return complement_adresse_admin;
	}

	public void setComplement_adresse_admin(String complement_adresse_admin) {
		this.complement_adresse_admin = complement_adresse_admin;
	}
}
