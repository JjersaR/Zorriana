package com.zorriana.backend.datosPersonales.entity;

import com.zorriana.backend.generos.entity.Generos;
import com.zorriana.backend.usuarios.entity.Usuarios;
import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
public class DatosPersonales {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Usuarios_Datos_Personales_ID")
  private long usuarioID;

  // FK de Usuarios
  @OneToOne(targetEntity = Usuarios.class)
  @JoinColumn(name = "Usuario_ID", referencedColumnName = "Usuario_ID")
  private Usuarios usuario;

  // Nombre
  @Column(length = 50, nullable = false)
  private String nombre;

  // Apellido Paterno
  @Column(length = 50, nullable = false)
  private String apellidoPaterno;

  // Apellido Materno
  @Column(length = 50, nullable = false)
  private String apellidoMaterno;

  // fecha de nacimiento
  @Column(nullable = false, columnDefinition = "DATE")
  private LocalDate fechaNacimiento;

  // FK genero
  @OneToOne(targetEntity = Generos.class)
  @JoinColumn(name = "Genero_ID")
  private Generos genero;
}
