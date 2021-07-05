package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.tender_du_poulet.beans.Negocier;

public interface NegocierRepository extends JpaRepository<Negocier, Integer>   {

}
