package com.ucad.m2sir.votingapp.controlleur;

import com.ucad.m2sir.votingapp.entite.Student;
import com.ucad.m2sir.votingapp.service.StudentService;
import com.ucad.m2sir.votingapp.utils.ServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/student")
public class StudentControlleur {
    private StudentService studentService;

    @PostMapping(name = "/create")
    public ResponseEntity<ServiceResponse> save(@RequestBody Student student) {
        try {
            return ResponseEntity.ok(
                    ServiceResponse.builder()
                            .success(true)
                            .data(studentService.save(student))
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
