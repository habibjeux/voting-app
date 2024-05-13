package sn.ucad.m2sir.vote.controlleur;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.ucad.m2sir.vote.entite.Candidat;
import sn.ucad.m2sir.vote.entite.Poste;
import sn.ucad.m2sir.vote.entite.Student;
import sn.ucad.m2sir.vote.service.CandidatService;
import sn.ucad.m2sir.vote.service.PosteService;
import sn.ucad.m2sir.vote.utils.ServiceResponse;

@RestController
@RequestMapping("/api/poste")
@RequiredArgsConstructor
public class PosteController {
    private final PosteService posteService;
    @PostMapping("/create")
    public ResponseEntity<ServiceResponse> save(@RequestBody Poste poste) {
        try {


            Poste savedPoste = posteService.save(poste);

            return ResponseEntity.ok(
                    ServiceResponse.builder()
                            .success(true)
                            .data(savedPoste)
                            .message("Candidats saved successfully")
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
