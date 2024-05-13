package sn.ucad.m2sir.vote.controlleur;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.ucad.m2sir.vote.entite.Candidat;
import sn.ucad.m2sir.vote.entite.Student;
import sn.ucad.m2sir.vote.service.CandidatService;
import sn.ucad.m2sir.vote.service.StudentService;
import sn.ucad.m2sir.vote.utils.ServiceResponse;

@RestController
@RequestMapping("/api/candidat")
@RequiredArgsConstructor
public class CandidatController {
    private final CandidatService candidatService;
    private final StudentService studentService;
    @PostMapping("/create")
    public ResponseEntity<ServiceResponse> save(@RequestBody Candidat candidat) {
        try {
            Student studentIfExist=studentService.findBynce(candidat.getStudent().getNce());
            System.out.println("Student not fou nce: " + candidat.getStudent());
        if (studentIfExist==null){

            return ResponseEntity.ok(
                    ServiceResponse.builder()
                            .success(false)
                            .data(studentIfExist)
                            .message("l'etudiant n'existe pas")
                            .build()
            );

        }
        else {
            Candidat savedCandidat = candidatService.save(candidat);
            return ResponseEntity.ok(
                    ServiceResponse.builder()
                            .success(true)
                            .data(savedCandidat)
                            .message("Candidats saved successfully")
                            .build()
            );
        }

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
