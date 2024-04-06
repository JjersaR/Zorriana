package com.zorriana.backend.categoriasArticulos.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public interface IProductosCategoria {
    // id del articulo
    @JsonIgnore
    long getArticuloArticuloID();

    // nombre del articulo
    @JsonProperty("Nombew")
    String getArticuloNombre();

    // descripcion del articulo
    @JsonProperty("Descripcion")
    String getArticuloDescripcion();

    // disponibilidad
    @JsonProperty("Disponible")
    Boolean getArticuloDisponible();

    // precio del articulo
    @JsonProperty("Precio")
    BigDecimal getArticuloPrecio();

    // num veces vendido
    @JsonProperty("Veces Vendido")
    Long getArticuloNumVecesVendido();

    // id de la categoria
    @JsonIgnore
    Long getCategoriaCategoriaID();

    // nombre de la categoria
    @JsonIgnore
    @JsonProperty("Categoria")
    String getCategoriaNombre();
}
