package fr.cda.tender_du_poulet.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Negociation implements Serializable{
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	int idNegociation;

	public Negociation(int idNegociation) {
		super();
		this.idNegociation = idNegociation;
	}

	public int getIdNegociation() {
		return idNegociation;
	}

	public void setIdNegociation(int idNegociation) {
		this.idNegociation = idNegociation;
	}
	
	
	
	
	

}
