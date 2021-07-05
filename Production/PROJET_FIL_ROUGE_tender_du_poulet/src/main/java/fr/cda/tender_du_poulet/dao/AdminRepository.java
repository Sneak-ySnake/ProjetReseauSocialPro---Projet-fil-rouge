package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.tender_du_poulet.beans.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
