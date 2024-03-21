package com.zorriana.backend.articulos.service;

import com.zorriana.backend.articulos.entity.Articulos;
import java.util.List;

public interface IArticulosService {
  // listar los articulos {PARA CLIENTES CON Y SIN REGISTRO}
  List<Articulos> findAll();

  // gudar producto {PARA ADMIN}
  void save(Articulos articulo);

  // actualizar producto {PARA ADMIN}
  void update(Articulos articulo);

  // borrar producto {PARA ADMIN}
  void deleteById(Long id);
}
