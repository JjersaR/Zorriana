package com.zorriana.backend.detalleVentaArticulos.repositoy;

import com.zorriana.backend.detalleVentaArticulos.entity.DetalleVentaArticulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDetalleVentaArticulosRepository
    extends JpaRepository<DetalleVentaArticulos, Long> {
    List<DetalleVentaArticulos> findByVentaArticuloUsuarioUsuarioID(Long id);
}
