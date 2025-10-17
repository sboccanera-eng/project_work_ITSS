package dev2426.ITSProjectWork.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev2426.ITSProjectWork.Model.Competenza;

@Repository
public interface CompetenzeRepository extends JpaRepository<Competenza, Long> {

}
