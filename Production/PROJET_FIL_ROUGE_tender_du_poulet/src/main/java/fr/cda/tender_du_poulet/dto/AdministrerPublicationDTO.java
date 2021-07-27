package fr.cda.tender_du_poulet.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.cda.tender_du_poulet.beans.AdministrerPublicationId;

public class AdministrerPublicationDTO {
	
		private AdministrerPublicationIdDTO administrer_publication_id;

		public AdministrerPublicationDTO() {
		}
		
		public AdministrerPublicationDTO (AdministrerPublicationIdDTO administrer_publication_id) {
			this.administrer_publication_id = administrer_publication_id;

		}

		public AdministrerPublicationIdDTO getAdministrer_publication_id() {
			return administrer_publication_id;
		}

		public void setAdministrer_publication_id(AdministrerPublicationIdDTO administrer_publication_id) {
			this.administrer_publication_id = administrer_publication_id;
		}

}
