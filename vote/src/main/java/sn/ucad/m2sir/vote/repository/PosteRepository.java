package sn.ucad.m2sir.vote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.ucad.m2sir.vote.entite.Poste;
import sn.ucad.m2sir.vote.entite.Student;

public interface PosteRepository extends JpaRepository<Poste, Long> {
}
