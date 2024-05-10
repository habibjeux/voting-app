package com.ucad.m2sir.votingapp.entite;

import jakarta.persistence.*;

@Entity
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String refNCE;

    @ManyToOne
    @JoinColumn(name = "poste_id")
    private Poste poste;

    private String photoURL;
    private String programme;

    // Getters and setters


}