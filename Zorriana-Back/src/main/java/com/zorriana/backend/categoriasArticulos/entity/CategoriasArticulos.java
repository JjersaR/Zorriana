package com.zorriana.backend.categoriasArticulos.entity;


import com.zorriana.backend.articulos.entity.Articulos;
import com.zorriana.backend.categorias.entity.Categorias;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class CategoriasArticulos {

  // PK
  @Id
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
