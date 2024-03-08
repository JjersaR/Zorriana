package com.zorriana.backend.datosPersonales.services.impl;

import com.zorriana.backend.datosPersonales.repository.IDatosPersonalesRepository;
import com.zorriana.backend.datosPersonales.services.IDatosPersonalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosPersonalesServiceImpl implements IDatosPersonalesService {

    @Autowired
    private IDatosPersonalesRepository repository;
}
