package com.zorriana.backend.articulos.repository;

import com.zorriana.backend.articulos.entity.Articulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IArticulosRepository extends JpaRepository<Articulos, Long> {

  @Transactional
  @Query("UPDATE Articulos a SET a.nombre = :#{#articulo.nombre}, a.descripcion ="
      + " :#{#articulo.descripcion}, a.disponible = :#{#articulo.disponible}, a.precio ="
      + " :#{#articulo.precio}, a.linkImagen = :#{#articulo.linkImagen} WHERE a.id ="
      + " :#{#articulo.id}")
  @Modifying
  void update(Articulos articulo);
}
