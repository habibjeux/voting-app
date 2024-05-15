package sn.ucad.m2sir.vote.repository;

import sn.ucad.m2sir.vote.entite.Student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long>{

    Student findBynce(String refNCE);
    void deleteByNce(String nce);
}