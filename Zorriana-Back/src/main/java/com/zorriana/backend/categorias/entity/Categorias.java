package com.zorriana.backend.categorias.entity;

import jakarta.persistence.*;

@Entity
public class Categorias {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Categoria_ID", unique = false)
  private long categoriaID;

  @Column(name = "Nombre_Categoria", length = 100, nullable = false)
  private String nombre;

  public Categorias() {
  }

  public long getCategoriaID() {
    return this.categoriaID;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setCategoriaID(long categoriaID) {
    this.categoriaID = categoriaID;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
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
    return result;
  }

  public String toString() {
    return "Categorias(categoriaID=" + this.getCategoriaID() + ", nombre=" + this.getNombre() + ")";
  }
}
