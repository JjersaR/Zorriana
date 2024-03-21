package com.zorriana.backend.ventaArticulos.service;

import com.zorriana.backend.ventaArticulos.entity.VentaArticulos;

import java.util.List;

public interface IVentaArticulosService {

    // MOSTRAR SUS COMPRAS
    List<VentaArticulos> findByIdUsuario(Long idUsuario);

}
