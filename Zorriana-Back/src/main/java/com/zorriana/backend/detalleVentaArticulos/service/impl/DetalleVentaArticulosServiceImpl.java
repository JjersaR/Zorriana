package com.zorriana.backend.detalleVentaArticulos.service.impl;

import com.zorriana.backend.detalleVentaArticulos.entity.DetalleVentaArticulos;
import com.zorriana.backend.detalleVentaArticulos.repositoy.IDetalleVentaArticulosRepository;
import com.zorriana.backend.detalleVentaArticulos.service.IDetalleVentaArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaArticulosServiceImpl implements IDetalleVentaArticulosService {

  @Autowired
  private IDetalleVentaArticulosRepository repository;

  @Override
  public List<DetalleVentaArticulos> findByVentaArticuloUsuarioUsuarioID(Long id) {
    return repository.findByVentaArticuloUsuarioUsuarioID(id);
  }

  @Override
  public void save(DetalleVentaArticulos detalleVentaArticulo) {
    repository.save(detalleVentaArticulo);
  }
}
