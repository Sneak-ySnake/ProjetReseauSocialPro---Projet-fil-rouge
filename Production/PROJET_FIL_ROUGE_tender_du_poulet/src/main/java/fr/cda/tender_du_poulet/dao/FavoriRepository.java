package fr.cda.tender_du_poulet.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.tender_du_poulet.beans.Favori;
import fr.cda.tender_du_poulet.beans.FavoriId;
import fr.cda.tender_du_poulet.dto.FavoriDTO;
import fr.cda.tender_du_poulet.dto.FavoriIdDTO;

public interface FavoriRepository extends JpaRepository<Favori, FavoriId> {

	 
 
}
