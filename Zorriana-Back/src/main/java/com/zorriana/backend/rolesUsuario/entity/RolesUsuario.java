package com.zorriana.backend.rolesUsuario.entity;

import com.zorriana.backend.roles.entity.Roles;
import com.zorriana.backend.usuarios.entity.Usuarios;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class RolesUsuario {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Rol_X_Usuario_ID")
  private Long rolUsuarioID;

  // FK de Usuarios
  @ManyToOne
  @JoinColumn(name = "Usuario_ID", nullable = false)
  private Usuarios usuario;

  // FK de roles
  @ManyToOne
  @JoinColumn(name = "Rol_ID", nullable = false)
  private Roles rol;
}
