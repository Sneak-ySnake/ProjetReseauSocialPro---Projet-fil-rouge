package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.tender_du_poulet.beans.AccesPublication;
import fr.cda.tender_du_poulet.beans.AccesPublicationId;

public interface AccesPublicationRepository extends JpaRepository<AccesPublication, AccesPublicationId> {

}
