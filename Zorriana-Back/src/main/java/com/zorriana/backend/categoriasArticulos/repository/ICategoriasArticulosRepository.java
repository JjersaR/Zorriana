package com.zorriana.backend.categoriasArticulos.repository;

import com.zorriana.backend.categorias.entity.Categorias;
import com.zorriana.backend.categoriasArticulos.dto.INombresCategorias;
import com.zorriana.backend.categoriasArticulos.entity.CategoriasArticulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoriasArticulosRepository extends JpaRepository<CategoriasArticulos, Long> {
    List<Categorias> findByCategoriaNombre(String nombre);
    List<INombresCategorias> findDistinctBy();
}
