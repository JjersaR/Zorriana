package com.zorriana.backend.usuarios.entity;

import com.zorriana.backend.roles.entity.Roles;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Usuarios {

  // PK
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Usuario_ID")
  private long usuarioID;

  // nombre de usuario
  @Column(length = 20, nullable = false, unique = true)
  private String username;

  // contraseña
  @Column(name = "contrasenia", nullable = false)
  private String password;

  // correo electronico
  @Column(length = 50, nullable = false, unique = true)
  private String correo;

  // numero de telefono
  @Column(length = 10, nullable = false)
  private String telefono;

  // fecha de creación del usuario
  @Column(name = "fecha_creacion", nullable = false, columnDefinition = "DATE")
  private LocalDate fechaCreacion;

  // ultimo inicio de sesión
  @Column(name = "ulitmo_inicio_sesion", nullable = false, columnDefinition = "DATE")
  private LocalDate ultimoInicioSesion;

  // cosas que pide Spring boot
  @Column(name = "is_enabled")
  private boolean isEnabled;

  @Column(name = "account_no_expired")
  private boolean accountNoExpired;

  @Column(name = "account_no_locked")
  private boolean accountNoLocked;

  @Column(name = "credential_no_expired")
  private boolean credentialNoExpired;

  @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "Usuario_ID"), inverseJoinColumns = @JoinColumn(name = "Rol_ID"))
  private Set<Roles> roles = new HashSet<>();

  public Usuarios() {
  }

  public long getUsuarioID() {
    return this.usuarioID;
  }

  public String getUsername() {
    return this.username;
  }

  public String getPassword() {
    return this.password;
  }

  public String getCorreo() {
    return this.correo;
  }

  public String getTelefono() {
    return this.telefono;
  }

  public LocalDate getFechaCreacion() {
    return this.fechaCreacion;
  }

  public LocalDate getUltimoInicioSesion() {
    return this.ultimoInicioSesion;
  }

  public boolean isEnabled() {
    return this.isEnabled;
  }

  public boolean isAccountNoExpired() {
    return this.accountNoExpired;
  }

  public boolean isAccountNoLocked() {
    return this.accountNoLocked;
  }

  public boolean isCredentialNoExpired() {
    return this.credentialNoExpired;
  }

  public Set<Roles> getRoles() {
    return this.roles;
  }

  public void setUsuarioID(long usuarioID) {
    this.usuarioID = usuarioID;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public void setFechaCreacion(LocalDate fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public void setUltimoInicioSesion(LocalDate ultimoInicioSesion) {
    this.ultimoInicioSesion = ultimoInicioSesion;
  }

  public void setEnabled(boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public void setAccountNoExpired(boolean accountNoExpired) {
    this.accountNoExpired = accountNoExpired;
  }

  public void setAccountNoLocked(boolean accountNoLocked) {
    this.accountNoLocked = accountNoLocked;
  }

  public void setCredentialNoExpired(boolean credentialNoExpired) {
    this.credentialNoExpired = credentialNoExpired;
  }

  public void setRoles(Set<Roles> roles) {
    this.roles = roles;
  }

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Usuarios)) return false;
    final Usuarios other = (Usuarios) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.getUsuarioID() != other.getUsuarioID()) return false;
    final Object this$username = this.getUsername();
    final Object other$username = other.getUsername();
    if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
    final Object this$password = this.getPassword();
    final Object other$password = other.getPassword();
    if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
    final Object this$correo = this.getCorreo();
    final Object other$correo = other.getCorreo();
    if (this$correo == null ? other$correo != null : !this$correo.equals(other$correo)) return false;
    final Object this$telefono = this.getTelefono();
    final Object other$telefono = other.getTelefono();
    if (this$telefono == null ? other$telefono != null : !this$telefono.equals(other$telefono)) return false;
    final Object this$fechaCreacion = this.getFechaCreacion();
    final Object other$fechaCreacion = other.getFechaCreacion();
    if (this$fechaCreacion == null ? other$fechaCreacion != null : !this$fechaCreacion.equals(other$fechaCreacion))
      return false;
    final Object this$ultimoInicioSesion = this.getUltimoInicioSesion();
    final Object other$ultimoInicioSesion = other.getUltimoInicioSesion();
    if (this$ultimoInicioSesion == null ? other$ultimoInicioSesion != null : !this$ultimoInicioSesion.equals(other$ultimoInicioSesion))
      return false;
    if (this.isEnabled() != other.isEnabled()) return false;
    if (this.isAccountNoExpired() != other.isAccountNoExpired()) return false;
    if (this.isAccountNoLocked() != other.isAccountNoLocked()) return false;
    if (this.isCredentialNoExpired() != other.isCredentialNoExpired()) return false;
    final Object this$roles = this.getRoles();
    final Object other$roles = other.getRoles();
    if (this$roles == null ? other$roles != null : !this$roles.equals(other$roles)) return false;
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof Usuarios;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final long $usuarioID = this.getUsuarioID();
    result = result * PRIME + (int) ($usuarioID >>> 32 ^ $usuarioID);
    final Object $username = this.getUsername();
    result = result * PRIME + ($username == null ? 43 : $username.hashCode());
    final Object $password = this.getPassword();
    result = result * PRIME + ($password == null ? 43 : $password.hashCode());
    final Object $correo = this.getCorreo();
    result = result * PRIME + ($correo == null ? 43 : $correo.hashCode());
    final Object $telefono = this.getTelefono();
    result = result * PRIME + ($telefono == null ? 43 : $telefono.hashCode());
    final Object $fechaCreacion = this.getFechaCreacion();
    result = result * PRIME + ($fechaCreacion == null ? 43 : $fechaCreacion.hashCode());
    final Object $ultimoInicioSesion = this.getUltimoInicioSesion();
    result = result * PRIME + ($ultimoInicioSesion == null ? 43 : $ultimoInicioSesion.hashCode());
    result = result * PRIME + (this.isEnabled() ? 79 : 97);
    result = result * PRIME + (this.isAccountNoExpired() ? 79 : 97);
    result = result * PRIME + (this.isAccountNoLocked() ? 79 : 97);
    result = result * PRIME + (this.isCredentialNoExpired() ? 79 : 97);
    final Object $roles = this.getRoles();
    result = result * PRIME + ($roles == null ? 43 : $roles.hashCode());
    return result;
  }

  public String toString() {
    return "Usuarios(usuarioID=" + this.getUsuarioID() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", correo=" + this.getCorreo() + ", telefono=" + this.getTelefono() + ", fechaCreacion=" + this.getFechaCreacion() + ", ultimoInicioSesion=" + this.getUltimoInicioSesion() + ", isEnabled=" + this.isEnabled() + ", accountNoExpired=" + this.isAccountNoExpired() + ", accountNoLocked=" + this.isAccountNoLocked() + ", credentialNoExpired=" + this.isCredentialNoExpired() + ", roles=" + this.getRoles() + ")";
  }
}
