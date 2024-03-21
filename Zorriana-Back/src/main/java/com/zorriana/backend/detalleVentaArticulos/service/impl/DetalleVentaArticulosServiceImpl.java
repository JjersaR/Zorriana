package com.zorriana.backend.detalleVentaArticulos.service.impl;

import com.zorriana.backend.detalleVentaArticulos.repositoy.IDetalleVentaArticulosRepository;
import com.zorriana.backend.detalleVentaArticulos.service.IDetalleVentaArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleVentaArticulosServiceImpl implements IDetalleVentaArticulosService {

  @Autowired
  private IDetalleVentaArticulosRepository repository;
}
