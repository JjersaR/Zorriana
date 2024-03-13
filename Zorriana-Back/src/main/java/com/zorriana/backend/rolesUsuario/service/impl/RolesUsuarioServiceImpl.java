package com.zorriana.backend.rolesUsuario.service.impl;

import com.zorriana.backend.roles.service.IRolesService;
import com.zorriana.backend.rolesUsuario.repository.IRolesUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesUsuarioServiceImpl implements IRolesService {

  @Autowired
  private IRolesUsuarioRepository repository;
}
