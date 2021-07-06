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
	int id_negociation;

	public Negociation() {}
	 
	public int getIdNegociation() {
		return id_negociation;
	}

	public void setIdNegociation(int id_negociation) {
		this.id_negociation = id_negociation;
	}
	
}
