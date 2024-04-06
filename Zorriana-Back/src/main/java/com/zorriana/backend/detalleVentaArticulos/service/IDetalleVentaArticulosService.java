package com.zorriana.backend.detalleVentaArticulos.service;

import com.zorriana.backend.detalleVentaArticulos.entity.DetalleVentaArticulos;

import java.util.List;

public interface IDetalleVentaArticulosService {
    // listar compras de USUARIOS REGRISTRADOS
    List<DetalleVentaArticulos> findByVentaArticuloUsuarioUsuarioID(Long id);

    // hacer compra
    void save(DetalleVentaArticulos detalleVentaArticulo);
}
