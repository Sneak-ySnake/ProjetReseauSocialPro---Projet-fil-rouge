package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.tender_du_poulet.beans.Favori;

public interface FavoriRepository extends JpaRepository<Favori, Integer> {

}
