package com.zorriana.backend.roles.entity;

import com.zorriana.backend.permisos.Permisos;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Roles {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Rol_ID", unique = true)
  private long RolID;

  @Column(nullable = false, length = 50, unique = true)
  @Enumerated(EnumType.STRING)
  private ERole Nombre;

  @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinTable(name = "roles_permisos", joinColumns = @JoinColumn(name = "Rol_ID"), inverseJoinColumns = @JoinColumn(name = "Permiso_ID"))
  private Set<Permisos> permisosList = new HashSet<>();

  public Roles() {
  }

  public long getRolID() {
    return this.RolID;
  }

  public ERole getNombre() {
    return this.Nombre;
  }

  public Set<Permisos> getPermisosList() {
    return this.permisosList;
  }

  public void setRolID(long RolID) {
    this.RolID = RolID;
  }

  public void setNombre(ERole Nombre) {
    this.Nombre = Nombre;
  }

  public void setPermisosList(Set<Permisos> permisosList) {
    this.permisosList = permisosList;
  }

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Roles)) return false;
    final Roles other = (Roles) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.getRolID() != other.getRolID()) return false;
    final Object this$Nombre = this.getNombre();
    final Object other$Nombre = other.getNombre();
    if (this$Nombre == null ? other$Nombre != null : !this$Nombre.equals(other$Nombre)) return false;
    final Object this$permisosList = this.getPermisosList();
    final Object other$permisosList = other.getPermisosList();
    if (this$permisosList == null ? other$permisosList != null : !this$permisosList.equals(other$permisosList))
      return false;
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof Roles;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final long $RolID = this.getRolID();
    result = result * PRIME + (int) ($RolID >>> 32 ^ $RolID);
    final Object $Nombre = this.getNombre();
    result = result * PRIME + ($Nombre == null ? 43 : $Nombre.hashCode());
    final Object $permisosList = this.getPermisosList();
    result = result * PRIME + ($permisosList == null ? 43 : $permisosList.hashCode());
    return result;
  }

  public String toString() {
    return "Roles(RolID=" + this.getRolID() + ", Nombre=" + this.getNombre() + ", permisosList=" + this.getPermisosList() + ")";
  }
}
