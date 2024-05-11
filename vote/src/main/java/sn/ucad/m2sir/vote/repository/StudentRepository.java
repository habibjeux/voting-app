package sn.ucad.m2sir.vote.repository;

import sn.ucad.m2sir.vote.entite.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
}