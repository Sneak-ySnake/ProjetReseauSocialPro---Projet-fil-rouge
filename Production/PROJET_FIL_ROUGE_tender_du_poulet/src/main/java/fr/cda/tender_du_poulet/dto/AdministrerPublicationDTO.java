package fr.cda.tender_du_poulet.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import fr.cda.tender_du_poulet.beans.AdministrerPublicationId;

public class AdministrerPublicationDTO {
	
		private AdministrerPublicationId administrer_publicationId;

		public AdministrerPublicationDTO() {
		}
		
		public AdministrerPublicationDTO (AdministrerPublicationId administrer_publicationId) {
			this.setAdministrer_publicationId(administrer_publicationId);

		}

		public AdministrerPublicationId getAdministrer_publicationId() {
			return administrer_publicationId;
		}

		public void setAdministrer_publicationId(AdministrerPublicationId administrer_publicationId) {
			this.administrer_publicationId = administrer_publicationId;
		}

}
