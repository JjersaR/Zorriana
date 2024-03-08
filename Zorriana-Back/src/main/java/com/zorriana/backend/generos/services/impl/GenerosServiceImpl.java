package com.zorriana.backend.generos.services.impl;

import com.zorriana.backend.generos.repository.IGenerosRepository;
import com.zorriana.backend.generos.services.IGenerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerosServiceImpl implements IGenerosService {

    @Autowired
    private IGenerosRepository repository;
}
