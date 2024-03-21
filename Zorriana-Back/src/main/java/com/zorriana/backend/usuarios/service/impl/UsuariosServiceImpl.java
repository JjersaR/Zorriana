package com.zorriana.backend.usuarios.service.impl;

import com.zorriana.backend.usuarios.entity.Usuarios;
import com.zorriana.backend.usuarios.repository.IUsuariosRepository;
import com.zorriana.backend.usuarios.service.IUsuariosService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements IUsuariosService {

  @Autowired
  private IUsuariosRepository repository;

  @Override
  public List<Usuarios> findAll() {
    return repository.findAll();
  }

  @Override
  public Optional<Usuarios> findById(Long id) {
    return repository.findById(id);
  }

  @Override
  public void save(Usuarios usuario) {
    repository.save(usuario);
  }

  @Override
  public void update(Usuarios usuario) {
    repository.update(usuario);
  }

  @Override
  public void deleteById(Long id) {
    repository.deleteById(id);
  }
}
