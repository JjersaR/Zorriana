package com.zorriana.backend.categoriasArticulos.entity;


import com.zorriana.backend.articulos.entity.Articulos;
import com.zorriana.backend.categorias.entity.Categorias;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CategoriasArticulos {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Categoria_X_Articulo_ID")
  private long categoriaXArticuloID;

  // FK de categorias
  @ManyToOne
  @JoinColumn(name = "Categoria_ID", nullable = false)
  private Categorias categoria;

  // FK de articulos
  @ManyToOne
  @JoinColumn(name = "Articulo_ID", nullable = false)
  private Articulos articulo;
}
