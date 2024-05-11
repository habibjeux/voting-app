package sn.ucad.m2sir.vote.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.ucad.m2sir.vote.entite.Student;
import sn.ucad.m2sir.vote.repository.StudentRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> saveAll(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

}