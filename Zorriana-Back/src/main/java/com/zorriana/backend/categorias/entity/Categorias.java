package com.zorriana.backend.categorias.entity;

import jakarta.persistence.*;

@Entity
public class Categorias {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Categoria_ID")
  private long categoriaID;

  @Column(name = "Nombre_Categoria", length = 100, nullable = false, unique = true)
  private String nombre;

  @Column(name = "Link_Imagen")
  private String linkImagen;


  public long getCategoriaID() {
    return this.categoriaID;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getLinkImagen() {
    return this.linkImagen;
  }

  public void setCategoriaID(long categoriaID) {
    this.categoriaID = categoriaID;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setLinkImagen(String linkImagen) {
    this.linkImagen = linkImagen;
  }

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Categorias)) return false;
    final Categorias other = (Categorias) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.getCategoriaID() != other.getCategoriaID()) return false;
    final Object this$nombre = this.getNombre();
    final Object other$nombre = other.getNombre();
    if (this$nombre == null ? other$nombre != null : !this$nombre.equals(other$nombre)) return false;
    final Object this$linkImagen = this.getLinkImagen();
    final Object other$linkImagen = other.getLinkImagen();
    if (this$linkImagen == null ? other$linkImagen != null : !this$linkImagen.equals(other$linkImagen)) return false;
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof Categorias;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final long $categoriaID = this.getCategoriaID();
    result = result * PRIME + (int) ($categoriaID >>> 32 ^ $categoriaID);
    final Object $nombre = this.getNombre();
    result = result * PRIME + ($nombre == null ? 43 : $nombre.hashCode());
    final Object $linkImagen = this.getLinkImagen();
    result = result * PRIME + ($linkImagen == null ? 43 : $linkImagen.hashCode());
    return result;
  }

  public String toString() {
    return "Categorias(categoriaID=" + this.getCategoriaID() + ", nombre=" + this.getNombre() + ", linkImagen=" + this.getLinkImagen() + ")";
  }
}
