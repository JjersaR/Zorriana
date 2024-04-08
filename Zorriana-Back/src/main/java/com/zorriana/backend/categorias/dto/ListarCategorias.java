package com.zorriana.backend.categorias.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ListarCategorias implements Serializable {
    private long categoriaID;

    @JsonProperty("Nombre")
    private String nombre;

    private String linkImagen;

    public long getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(long categoriaID) {
        this.categoriaID = categoriaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLinkImagen() {
        return linkImagen;
    }

    public void setLinkImagen(String linkImagen) {
        this.linkImagen = linkImagen;
    }
}
