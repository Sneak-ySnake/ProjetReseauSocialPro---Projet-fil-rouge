package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cda.tender_du_poulet.beans.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>{

	@Query("select u from Utilisateur u where u.email_utilisateur = (:email_utilisateur)")
	public Utilisateur findByEmail(@Param("email_utilisateur") String email_utilisateur);
	
	
}
