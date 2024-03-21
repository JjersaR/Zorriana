package com.zorriana.backend.rolesUsuario.repository;

import com.zorriana.backend.rolesUsuario.entity.RolesUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolesUsuarioRepository extends JpaRepository<RolesUsuario, Long> {
}
