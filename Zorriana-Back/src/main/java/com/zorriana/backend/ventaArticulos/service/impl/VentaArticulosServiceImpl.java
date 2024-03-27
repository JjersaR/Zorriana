package com.zorriana.backend.ventaArticulos.service.impl;

import com.zorriana.backend.ventaArticulos.entity.VentaArticulos;
import com.zorriana.backend.ventaArticulos.repository.IVentaArticulosRepository;
import com.zorriana.backend.ventaArticulos.service.IVentaArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaArticulosServiceImpl implements IVentaArticulosService {

  @Autowired
  private IVentaArticulosRepository repository;

  @Override
  public List<VentaArticulos> findByIdUsuario(Long idUsuario) {
    return repository.findByUsuarioUsuarioID(idUsuario);
  }

}
