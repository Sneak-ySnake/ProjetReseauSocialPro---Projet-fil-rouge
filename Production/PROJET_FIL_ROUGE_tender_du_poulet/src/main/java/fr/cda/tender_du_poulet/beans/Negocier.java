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
	private NegocierId negocierid;
	
	@Column(name="message")
	private String message;

	public Negocier() {}
	
	public Negocier( String message) {
		this.message = message;
	}

	public Negocier(NegocierId negocierid, String message) {
		this.negocierid = negocierid;
		this.message = message;
	}

	public NegocierId getNegocierid() {
		return negocierid;
	}

	public void setNegocierid(NegocierId negocierid) {
		this.negocierid = negocierid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	 

}
