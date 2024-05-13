package sn.ucad.m2sir.vote.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {


    @Id
    private String nce;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // Getters and setters


}