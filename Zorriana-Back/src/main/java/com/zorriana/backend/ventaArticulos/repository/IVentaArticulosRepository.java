package com.zorriana.backend.ventaArticulos.repository;

import com.zorriana.backend.ventaArticulos.entity.VentaArticulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaArticulosRepository extends JpaRepository<VentaArticulos, Long> {
}
