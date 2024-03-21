package com.zorriana.backend.categorias.service.impl;

import com.zorriana.backend.categorias.entity.Categorias;
import org.springframework.beans.factory.annotation.Autowired;

import com.zorriana.backend.categorias.repositoy.ICategoriasRepository;
import com.zorriana.backend.categorias.service.ICategoriasService;

import java.util.List;
import java.util.Optional;

public class CategoriaServiceImpl implements ICategoriasService {

  @Autowired
  private ICategoriasRepository repository;

  @Override
  public List<Categorias> findAll() {
    return repository.findAll();
  }

  @Override
  public Optional<Categorias> findById(Long id) {
    return repository.findById(id);
  }


  @Override
  public void save(Categorias categoria) {
    repository.save(categoria);
  }

  @Override
  public void update(Categorias categoria) {
    repository.update(categoria);
  }

  @Override
  public void deleteById(Long id) {
    Optional<Categorias> catOp = repository.findById(id);
    if (!catOp.isEmpty() || catOp.isPresent()) {
      repository.deleteById(id);
    }
  }
}
