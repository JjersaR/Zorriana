package com.zorriana.backend.categorias.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Categorias {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Categoria_ID", unique = false)
  private long categoriaID;

  @Column(name = "Nombre_Categoria", length = 100, nullable = false)
  private String nombre;
}
