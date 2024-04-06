package com.zorriana.backend.usuarios.service.impl;

import com.zorriana.backend.usuarios.entity.Usuarios;
import com.zorriana.backend.usuarios.repository.IUsuariosRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private IUsuariosRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuarios usuarios = repository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("El usuario " + username + " no existe"));
        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();

        usuarios.getRoles().forEach(role -> authorityList.add(new SimpleGrantedAuthority("ROLE_".concat(role.getNombre().name()))));

        usuarios.getRoles().stream().flatMap(role-> role.getPermisosList().stream()).forEach(permiso -> authorityList.add(new SimpleGrantedAuthority(permiso.getNombre())));
        return new User(usuarios.getUsername(),usuarios.getPassword(), usuarios.isEnabled(), usuarios.isAccountNoExpired(), usuarios.isCredentialNoExpired(), usuarios.isAccountNoLocked(), authorityList);
    }
}
