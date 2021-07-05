package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.tender_du_poulet.beans.Utilisateur_EtatCompte;

public interface Utilisateur_EtatCompteRepository extends JpaRepository<Utilisateur_EtatCompte, Integer> {

}
