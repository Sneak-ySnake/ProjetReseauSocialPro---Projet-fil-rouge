package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.tender_du_poulet.beans.EtatCompte;

public interface EtatCompteRepository extends JpaRepository<EtatCompte, Integer>{

}
