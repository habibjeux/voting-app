package sn.ucad.m2sir.vote.entite;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;

    // Getters and setters


}