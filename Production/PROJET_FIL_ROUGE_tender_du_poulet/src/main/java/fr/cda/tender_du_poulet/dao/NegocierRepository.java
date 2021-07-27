package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.tender_du_poulet.beans.Negocier;
import fr.cda.tender_du_poulet.beans.NegocierId;

public interface NegocierRepository extends JpaRepository<Negocier, NegocierId>   {

}
