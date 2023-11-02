package com.example.pigeonnier.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Pigeon {

    @Id
    @GeneratedValue
    private Integer idPigeon;
    private String nom;
    private String proprio;
    private String code;

    public Pigeon(String nom, String proprio, String code) {
        super();
        this.nom = nom;
        this.proprio = proprio;
        this.code = code;
    }
}
