package com.zorriana.backend.usuarios.repository;

import com.zorriana.backend.usuarios.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios, Long> {

  @Transactional
  @Query("UPDATE Usuarios u SET u.username = :#{#usuario.username}, u.password ="
      + " :#{#usuario.password}, u.correo = :#{#usuario.correo}, u.telefono ="
      + " :#{#usuario.telefono} WHERE u.usuarioID = :#{#usuario.usuarioID}")
  @Modifying
  void update(Usuarios usuario);
}
