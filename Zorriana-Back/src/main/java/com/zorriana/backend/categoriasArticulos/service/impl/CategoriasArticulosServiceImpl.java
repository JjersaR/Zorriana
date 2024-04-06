package com.zorriana.backend.categoriasArticulos.service.impl;

import com.zorriana.backend.categorias.entity.Categorias;
import com.zorriana.backend.categoriasArticulos.dto.INombresCategorias;
import com.zorriana.backend.categoriasArticulos.dto.IProductosCategoria;
import com.zorriana.backend.categoriasArticulos.entity.CategoriasArticulos;
import com.zorriana.backend.categoriasArticulos.repository.ICategoriasArticulosRepository;
import com.zorriana.backend.categoriasArticulos.service.ICategoriasArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriasArticulosServiceImpl implements ICategoriasArticulosService {

  @Autowired
  private ICategoriasArticulosRepository repository;

  @Override
  public List<CategoriasArticulos> findAll() {
    return repository.findAll();
  }

  @Override
  public List<INombresCategorias> findByNombre() {
    return repository.findDistinctBy();
  }

  @Override
  public List<Categorias> findByCategoriaNombre(String nombre) {
    return repository.findByCategoriaNombre(nombre);
  }

  @Override
  public List<IProductosCategoria> findByArticulosXCategoria(String categoria) {
    return repository.findByArticulosXCategoria(categoria);
  }
}
