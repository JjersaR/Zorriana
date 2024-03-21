package com.zorriana.backend.detalleVentaArticulos.repositoy;

import com.zorriana.backend.detalleVentaArticulos.entity.DetalleVentaArticulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleVentaArticulosRepository
    extends JpaRepository<DetalleVentaArticulos, Long> {
}
