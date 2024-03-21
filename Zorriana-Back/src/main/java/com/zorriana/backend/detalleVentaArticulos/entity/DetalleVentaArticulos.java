package com.zorriana.backend.detalleVentaArticulos.entity;

import com.zorriana.backend.articulos.entity.Articulos;
import com.zorriana.backend.ventaArticulos.entity.VentaArticulos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import lombok.Data;

@Entity
@Data
public class DetalleVentaArticulos {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Detalle_Venta_ID")
  private long detalleVentaID;

  // FK de VentaArticulos
  @ManyToOne
  @JoinColumn(name = "Venta_Articulo_ID", nullable = false)
  private VentaArticulos ventaArticulo;

  // FK de Articulo
  @ManyToOne
  @JoinColumn(name = "Articulo_ID", nullable = false)
  private Articulos articulos;

  @Column(name = "Cantidad", nullable = false)
  private int cantidad;

  @Column(name = "Subtotal", nullable = false)
  private BigDecimal subTotal;
}
