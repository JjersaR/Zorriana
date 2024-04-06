package com.zorriana.backend.permisos;

import jakarta.persistence.*;

@Entity
public class Permisos {

    // PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permiso_ID")
    private Long permisoID;

    @Column(unique = true, nullable = false, updatable = false)
    private String nombre;

    public Permisos() {
    }

    public Long getPermisoID() {
        return this.permisoID;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPermisoID(Long permisoID) {
        this.permisoID = permisoID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Permisos)) return false;
        final Permisos other = (Permisos) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$permisoID = this.getPermisoID();
        final Object other$permisoID = other.getPermisoID();
        if (this$permisoID == null ? other$permisoID != null : !this$permisoID.equals(other$permisoID)) return false;
        final Object this$nombre = this.getNombre();
        final Object other$nombre = other.getNombre();
        if (this$nombre == null ? other$nombre != null : !this$nombre.equals(other$nombre)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Permisos;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $permisoID = this.getPermisoID();
        result = result * PRIME + ($permisoID == null ? 43 : $permisoID.hashCode());
        final Object $nombre = this.getNombre();
        result = result * PRIME + ($nombre == null ? 43 : $nombre.hashCode());
        return result;
    }

    public String toString() {
        return "Permisos(permisoID=" + this.getPermisoID() + ", nombre=" + this.getNombre() + ")";
    }
}
