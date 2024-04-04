package com.zorriana.backend.categoriasArticulos.service;

import com.zorriana.backend.categorias.entity.Categorias;
import com.zorriana.backend.categoriasArticulos.dto.INombresCategorias;
import com.zorriana.backend.categoriasArticulos.dto.IProductosCategoria;
import com.zorriana.backend.categoriasArticulos.entity.CategoriasArticulos;

import java.util.List;

public interface ICategoriasArticulosService {
    // listar categorias
    List<CategoriasArticulos> findAll();

    // listar nombres de categorias
    List<INombresCategorias> findByNombre();

    // listar productos por categorias
    List<Categorias> findByCategoriaNombre(String nombre);

    // encontrar productos por categoria
    List<IProductosCategoria> findByArticulosXCategoria(String categoria);
}
