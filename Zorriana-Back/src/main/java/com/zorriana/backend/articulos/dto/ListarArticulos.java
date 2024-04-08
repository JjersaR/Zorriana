package com.zorriana.backend.articulos.dto;


import java.math.BigDecimal;


public class ListarArticulos {
    // obtener id sin mostrar
    private long ArticuloID;

    // obtener nombre
    private String nombre;

    // obtener descripcion
    private String descripcion;

    // SI esta disponible
    private boolean disponible;

    // el precio
    private BigDecimal precio;

    // veces vendido
    private long numVecesVendido;

    // link pero sin mostrar
    private String linkImagen;

    public long getArticuloID() {
        return ArticuloID;
    }

    public void setArticuloID(long articuloID) {
        ArticuloID = articuloID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public long getNumVecesVendido() {
        return numVecesVendido;
    }

    public void setNumVecesVendido(long numVecesVendido) {
        this.numVecesVendido = numVecesVendido;
    }

    public String getLinkImagen() {
        return linkImagen;
    }

    public void setLinkImagen(String linkImagen) {
        this.linkImagen = linkImagen;
    }
}
