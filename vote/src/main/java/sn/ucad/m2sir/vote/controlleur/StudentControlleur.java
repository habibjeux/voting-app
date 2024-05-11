package sn.ucad.m2sir.vote.controlleur;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ucad.m2sir.vote.entite.Student;
import sn.ucad.m2sir.vote.service.StudentService;
import sn.ucad.m2sir.vote.utils.ServiceResponse;

import java.util.List;


@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentControlleur {
    private final StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<ServiceResponse> saveBulk(@RequestBody List<Student> students) {
        try {

            List<Student> savedStudents = studentService.saveAll(students);

            return ResponseEntity.ok(
                    ServiceResponse.builder()
                            .success(true)
                            .data(savedStudents)
                            .message("Students saved successfully")
                            .build()
            );
        } catch (Exception e) {
            return ResponseEntity.ok(
                    ServiceResponse.builder()
                            .success(false)
                            .message(e.getMessage())
                            .build()
            );
        }
    }
    @GetMapping("/all")
    public ResponseEntity<ServiceResponse> getAll() {
        try {
            return ResponseEntity.ok(
                    ServiceResponse.builder()
                            .success(true)
                            .message("All Students")
                            .data(studentService.getAll())
                            .build()
            );
        } catch (Exception e) {
            return ResponseEntity.ok(
                    ServiceResponse.builder()
                            .success(false)
                            .message(e.getMessage())
                            .build()
            );
        }
    }
}