package fr.cda.tender_du_poulet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cda.tender_du_poulet.beans.Negocier;
import fr.cda.tender_du_poulet.beans.NegocierId;

public interface NegocierRepository extends JpaRepository<Negocier, NegocierId>   {

	@Query("select n from Negocier n where n.id_negocier.publication.id_publication=(:id_publication) ")
	public List<Negocier> findAllNegocierPublication(@Param("id_publication") int id_publication);
	
	@Query("select n from Negocier n where n.id_negocier.publication.id_publication=(:id_publication) and n.id_negocier.id_negociation=(:id_negociation) order by date")
	public List<Negocier> findAllMessagePublication(@Param("id_publication") int id_publication, @Param("id_negociation") String id_negociation);
	
	@Query("select n from Negocier n where n.id_negocier.utilisateur.id_utilisateur=(:id_utilisateur) ")
	public List<Negocier> findAllNegociationUtilisateur(@Param("id_utilisateur") int id_utilisateur);
}
