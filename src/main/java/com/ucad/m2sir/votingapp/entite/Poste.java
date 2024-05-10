package com.ucad.m2sir.votingapp.entite;

import jakarta.persistence.*;

@Entity
public class Poste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;

    // Getters and setters


}