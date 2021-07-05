package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.tender_du_poulet.beans.Utilisateur_Profil;

public interface Utilisateur_ProfilRepository extends JpaRepository<Utilisateur_Profil, Integer> {

}
