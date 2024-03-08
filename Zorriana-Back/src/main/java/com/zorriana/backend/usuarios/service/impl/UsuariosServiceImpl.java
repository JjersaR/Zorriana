package com.zorriana.backend.usuarios.service.impl;

import com.zorriana.backend.usuarios.repository.IUsuariosRepository;
import com.zorriana.backend.usuarios.service.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements IUsuariosService {

    @Autowired
    private IUsuariosRepository repository;
}
