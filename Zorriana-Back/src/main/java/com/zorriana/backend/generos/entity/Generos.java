package com.zorriana.backend.generos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Generos {

    // PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genero_ID")
    private Long generoID;

    // genero
    @Column(length = 50, nullable = false, unique = true)
    private String genero;
}
