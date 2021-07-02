package fr.cda.tender_du_poulet.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Negociation {
	
	@Id
	@GeneratedValue
	int idNegociation;
	

}
