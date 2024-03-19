package com.zorriana.backend.rolesUsuario.entity;

import com.zorriana.backend.roles.entity.Roles;
import com.zorriana.backend.usuarios.entity.Usuarios;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class RolesUsuario {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Rol_X_Usuario_ID")
  private long rolUsuarioID;

  // FK de Usuarios
  @ManyToOne
  @JoinColumn(name = "Usuario_ID", nullable = false)
  private Usuarios usuario;

  // FK de roles
  @ManyToOne
  @JoinColumn(name = "Rol_ID", nullable = false)
  private Roles rol;
}
