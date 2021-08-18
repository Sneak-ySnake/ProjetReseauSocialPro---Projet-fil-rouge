package fr.cda.tender_du_poulet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.cda.tender_du_poulet.beans.Admin;


public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	@Query("select a from Admin a where a.mail_admin = (:mail_admin)")
	public Admin findByEmail(@Param("mail_admin") String mail_admin);

}
