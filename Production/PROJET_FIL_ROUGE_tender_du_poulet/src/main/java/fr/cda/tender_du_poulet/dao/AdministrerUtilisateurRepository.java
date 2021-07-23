package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.tender_du_poulet.beans.AdministrerUtilisateur;
import fr.cda.tender_du_poulet.beans.AdministrerUtilisateurId;

public interface AdministrerUtilisateurRepository extends JpaRepository <AdministrerUtilisateur, AdministrerUtilisateurId> {

}
