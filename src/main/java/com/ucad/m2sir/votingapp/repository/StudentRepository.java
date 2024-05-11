package com.ucad.m2sir.votingapp.repository;

import com.ucad.m2sir.votingapp.entite.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
}
