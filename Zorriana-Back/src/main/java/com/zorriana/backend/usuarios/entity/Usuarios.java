package com.zorriana.backend.usuarios.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
public class Usuarios {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Usuario_ID")
  private long usuarioID;

  // nombre de usuario
  @Column(length = 20, nullable = false, unique = true)
  private String username;

  // contraseña
  @Column(length = 50, nullable = false)
  private String password;

  // correo electronico
  @Column(length = 50, nullable = false, unique = true)
  private String correo;

  // numero de telefono
  @Column(length = 10, nullable = false)
  private String telefono;

  // fecha de creación del usuario
  @Column(name = "fecha_creacion", nullable = false, columnDefinition = "DATE")
  private LocalDate fechaCreacion;

  // ultimo inicio de sesión
  @Column(name = "ulitmo_inicio_sesion", nullable = false, columnDefinition = "DATE")
  private LocalDate ultimoInicioSesion;
}
