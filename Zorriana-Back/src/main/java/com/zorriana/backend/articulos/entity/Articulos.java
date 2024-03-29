package com.zorriana.backend.articulos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import lombok.Data;

@Entity
@Data
public class Articulos {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Articulo_ID")
  private long ArticuloID;

  @Column(name = "Nombre", length = 100, nullable = false)
  private String nombre;

  @Column(name = "Descripcion", length = 500, nullable = false)
  private String descripcion;

  @Column(name = "Disponible", nullable = false)
  private boolean disponible;

  @Column(name = "Precio", nullable = false)
  private BigDecimal precio;

  @Column(name = "Num_Veces_Vendido", nullable = false)
  private long numVecesVendido;

  @Column(name = "Link_Imagen", length = 500, nullable = false)
  private String linkImagen;
}
