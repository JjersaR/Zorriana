package com.zorriana.backend.categorias.service;

import com.zorriana.backend.categorias.entity.Categorias;

import java.util.List;
import java.util.Optional;

public interface ICategoriasService {

    // {PARA CLIENTES Y VISITANTES Y ADMIN}
    List<Categorias> findAll();

    // por id de categoria
    Optional<Categorias> findById(Long id);

    // {PARA ADMIN}
    // guardar
    void save(Categorias categoria);

    // actualizar
    void update(Categorias categoria);

    // borrar
    void deleteById(Long id);
}
