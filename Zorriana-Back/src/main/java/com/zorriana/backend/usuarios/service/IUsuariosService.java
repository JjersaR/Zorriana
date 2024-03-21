package com.zorriana.backend.usuarios.service;

import com.zorriana.backend.usuarios.entity.Usuarios;
import java.util.List;
import java.util.Optional;

public interface IUsuariosService {

  // listrar todos los usuarios {PARA ADMIN}
  List<Usuarios> findAll();

  // encontrar un usuario {PARA ADMIN}
  Optional<Usuarios> findById(Long id);

  // guardar un usuario {PARA CLIENTE Y ADMIN}
  void save(Usuarios usuario);

  // actualizar {PARA CLIENTE}
  void update(Usuarios usuario);

  // eliminar {PARA CLIENTE Y ADMIN}
  void deleteById(Long id);
}
