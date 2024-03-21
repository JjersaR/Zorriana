package com.zorriana.backend.articulos.service;

import com.zorriana.backend.articulos.entity.Articulos;
import java.util.List;
import java.util.Optional;

public interface IArticulosService {
  // listar los articulos {PARA CLIENTES CON Y SIN REGISTRO}
  List<Articulos> findAll();

  Optional<Articulos> findById(Long id);

  // gudar producto {PARA ADMIN}
  void save(Articulos articulo);

  // actualizar producto {PARA ADMIN}
  void update(Articulos articulo);

  // borrar producto {PARA ADMIN}
  void deleteById(Long id);
}
