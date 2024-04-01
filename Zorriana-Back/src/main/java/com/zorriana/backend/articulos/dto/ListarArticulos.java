package com.zorriana.backend.articulos.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
public class ListarArticulos implements Serializable {
    // obtener id sin mostrar
    long ArticuloID;

    // obtener nombre
    String nombre;

    // obtener descripcion
    String descripcion;

    // SI esta disponible
    boolean disponible;

    // el precio
    BigDecimal precio;

    // veces vendido
    long numVecesVendido;

    // link pero sin mostrar
    @JsonIgnore
    String linkImagen;
}
