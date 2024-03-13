package com.zorriana.backend.roles.service.impl;

import com.zorriana.backend.roles.repositoy.IRolesRepository;
import com.zorriana.backend.roles.service.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceImpl implements IRolesService {

  @Autowired
  private IRolesRepository repository;
}
