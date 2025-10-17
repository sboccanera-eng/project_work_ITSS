package dev2426.ITSProjectWork.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev2426.ITSProjectWork.Model.Utente;

@Repository
public interface UtentiRepository extends JpaRepository<Utente, Long> {

}
