package com.esi.msformation.entities;

import com.esi.msformation.model.Etudiant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormation;
    private String nom;
    private int duree;

    @Transient
    private Collection<Etudiant> etudiants;


}
