package fr.cda.tender_du_poulet.beans;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="negocier")
public class Negocier {
	
	@Id
	@Embedded
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	private NegocierId id_negocier;
	
	@Column(name="message")
	private String message;

	public Negocier() {}
	
	public Negocier( String message) {
		this.message = message;
	}

	public Negocier(NegocierId id_negocier, String message) {
		this.id_negocier = id_negocier;
		this.message = message;
	}

	public NegocierId getNegocierid() {
		return id_negocier;
	}

	public void setNegocierid(NegocierId id_negocier) {
		this.id_negocier = id_negocier;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	 

}
