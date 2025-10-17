package dev2426.ITSProjectWork.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev2426.ITSProjectWork.Model.Candidatura;

@Repository
public interface CandidatureRepository extends JpaRepository<Candidatura, Long> {

}
