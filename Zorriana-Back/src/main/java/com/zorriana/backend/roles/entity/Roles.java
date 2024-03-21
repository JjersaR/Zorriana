package com.zorriana.backend.roles.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Roles {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Rol_ID", unique = true)
  private long RolID;

  @Column(nullable = false, length = 50)
  private String Nombre;
}
