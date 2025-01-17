package sn.ucad.m2sir.vote.entite;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "poste_id")
    private Poste poste;

    private String photoURL;
    private String programme;

    // Getters and setters


}