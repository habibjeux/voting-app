package com.ucad.m2sir.votingapp.service;

import com.ucad.m2sir.votingapp.entite.Student;
import com.ucad.m2sir.votingapp.repository.StudentRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;

    public Student save(Student student) {
        return  studentRepository.save(student);
    }
}
