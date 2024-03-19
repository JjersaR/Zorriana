package com.zorriana.backend.ventaArticulos.entity;

import com.zorriana.backend.usuarios.entity.Usuarios;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;

@Entity
@Data
public class VentaArticulos {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Venta_Articulo_ID")
  private long ventaArticuloID;

  // FK de usuarios
  @ManyToOne
  @JoinColumn(name = "Usuario_ID", nullable = false)
  private Usuarios usuario;

  @Column(name = "Fecha_Venta", columnDefinition = "DATETIME", nullable = false)
  private LocalDate fechaVenta;

  @Column(name = "Total_Venta", nullable = false)
  private BigDecimal totalVenta;
}
