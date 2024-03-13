package com.zorriana.backend.categoriasArticulos.service.impl;

import com.zorriana.backend.categoriasArticulos.repository.ICategoriasArticulosRepository;
import com.zorriana.backend.categoriasArticulos.service.ICategoriasArticulosService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoriasArticulosServiceImpl implements ICategoriasArticulosService {

  @Autowired
  private ICategoriasArticulosRepository repository;
}
