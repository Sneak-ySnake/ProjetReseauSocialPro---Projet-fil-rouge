package fr.cda.tender_du_poulet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cda.tender_du_poulet.beans.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Integer> {
	
	@Query("select p from Publication p where p.utilisateur.id_utilisateur = (:id_utilisateur) and p.type_publication.id_type_publication = (:id_type_publication)")
	public List<Publication> findAllPublicationByUtilisateur(@Param("id_utilisateur") int id_utilisateur, 
															 @Param("id_type_publication") int id_type_publication);
	

}
