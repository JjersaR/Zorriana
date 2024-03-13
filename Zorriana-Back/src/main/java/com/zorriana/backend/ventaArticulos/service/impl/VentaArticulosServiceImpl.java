package com.zorriana.backend.ventaArticulos.service.impl;

import com.zorriana.backend.ventaArticulos.repository.IVentaArticulosRepository;
import com.zorriana.backend.ventaArticulos.service.IVentaArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaArticulosServiceImpl implements IVentaArticulosService {

  @Autowired
  private IVentaArticulosRepository repository;
}
