package fr.cda.tender_du_poulet.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Negociation {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	int idNegociation;
	

}
