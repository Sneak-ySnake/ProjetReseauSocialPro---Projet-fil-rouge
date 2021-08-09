package fr.cda.tender_du_poulet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cda.tender_du_poulet.beans.Negocier;
import fr.cda.tender_du_poulet.beans.NegocierId;

public interface NegocierRepository extends JpaRepository<Negocier, NegocierId>   {

	@Query("select n from Negocier n where n.id_negocier.publication.id_publication=(:id_publication) group by n.id_negocier.utilisateur.id_utilisateur having count(*) = 1")
	public List<Negocier> findAllNegocierPublication(@Param("id_publication") int id_publication);
	
}
