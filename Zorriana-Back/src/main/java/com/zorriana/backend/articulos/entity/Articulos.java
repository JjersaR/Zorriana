package com.zorriana.backend.articulos.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
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

  @Column(name = "Disponible", nullable = false, columnDefinition = "BIT")
  private boolean disponible;

  @Column(name = "Precio", nullable = false)
  private BigDecimal precio;

  @Column(name = "Num_Veces_Vendido", nullable = false)
  private long numVecesVendido;

  @Column(name = "Link_Imagen", length = 500, nullable = false)
  private String linkImagen;

  public Articulos() {
  }

  public long getArticuloID() {
    return this.ArticuloID;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public boolean isDisponible() {
    return this.disponible;
  }

  public BigDecimal getPrecio() {
    return this.precio;
  }

  public long getNumVecesVendido() {
    return this.numVecesVendido;
  }

  public String getLinkImagen() {
    return this.linkImagen;
  }

  public void setArticuloID(long ArticuloID) {
    this.ArticuloID = ArticuloID;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }

  public void setNumVecesVendido(long numVecesVendido) {
    this.numVecesVendido = numVecesVendido;
  }

  public void setLinkImagen(String linkImagen) {
    this.linkImagen = linkImagen;
  }

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Articulos)) return false;
    final Articulos other = (Articulos) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.getArticuloID() != other.getArticuloID()) return false;
    final Object this$nombre = this.getNombre();
    final Object other$nombre = other.getNombre();
    if (this$nombre == null ? other$nombre != null : !this$nombre.equals(other$nombre)) return false;
    final Object this$descripcion = this.getDescripcion();
    final Object other$descripcion = other.getDescripcion();
    if (this$descripcion == null ? other$descripcion != null : !this$descripcion.equals(other$descripcion))
      return false;
    if (this.isDisponible() != other.isDisponible()) return false;
    final Object this$precio = this.getPrecio();
    final Object other$precio = other.getPrecio();
    if (this$precio == null ? other$precio != null : !this$precio.equals(other$precio)) return false;
    if (this.getNumVecesVendido() != other.getNumVecesVendido()) return false;
    final Object this$linkImagen = this.getLinkImagen();
    final Object other$linkImagen = other.getLinkImagen();
    if (this$linkImagen == null ? other$linkImagen != null : !this$linkImagen.equals(other$linkImagen)) return false;
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof Articulos;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final long $ArticuloID = this.getArticuloID();
    result = result * PRIME + (int) ($ArticuloID >>> 32 ^ $ArticuloID);
    final Object $nombre = this.getNombre();
    result = result * PRIME + ($nombre == null ? 43 : $nombre.hashCode());
    final Object $descripcion = this.getDescripcion();
    result = result * PRIME + ($descripcion == null ? 43 : $descripcion.hashCode());
    result = result * PRIME + (this.isDisponible() ? 79 : 97);
    final Object $precio = this.getPrecio();
    result = result * PRIME + ($precio == null ? 43 : $precio.hashCode());
    final long $numVecesVendido = this.getNumVecesVendido();
    result = result * PRIME + (int) ($numVecesVendido >>> 32 ^ $numVecesVendido);
    final Object $linkImagen = this.getLinkImagen();
    result = result * PRIME + ($linkImagen == null ? 43 : $linkImagen.hashCode());
    return result;
  }

  public String toString() {
    return "Articulos(ArticuloID=" + this.getArticuloID() + ", nombre=" + this.getNombre() + ", descripcion=" + this.getDescripcion() + ", disponible=" + this.isDisponible() + ", precio=" + this.getPrecio() + ", numVecesVendido=" + this.getNumVecesVendido() + ", linkImagen=" + this.getLinkImagen() + ")";
  }
}
