package com.zorriana.backend.usuarios.repository;

import com.zorriana.backend.usuarios.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios,Long> {
}
