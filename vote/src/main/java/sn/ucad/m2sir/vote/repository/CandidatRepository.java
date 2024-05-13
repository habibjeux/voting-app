package sn.ucad.m2sir.vote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.ucad.m2sir.vote.entite.Candidat;


public interface CandidatRepository extends JpaRepository<Candidat, Long> {
}
