package com.zorriana.backend.categorias.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zorriana.backend.categorias.repositoy.ICategoriasRepository;
import com.zorriana.backend.categorias.service.ICategoriasService;

public class CategoriaServiceImpl implements ICategoriasService {

  @Autowired
  private ICategoriasRepository repository;
}
