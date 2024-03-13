package com.zorriana.backend.articulos.service.impl;

import com.zorriana.backend.articulos.repository.IArticulosRepository;
import com.zorriana.backend.articulos.service.IArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticulosServiceImpl implements IArticulosService {

  @Autowired
  private IArticulosRepository repository;
}
