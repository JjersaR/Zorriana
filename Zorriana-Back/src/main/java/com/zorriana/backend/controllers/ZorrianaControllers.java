package com.zorriana.backend.controllers;

import com.zorriana.backend.articulos.mapper.IArticulosMapper;
import com.zorriana.backend.articulos.service.IArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zorriana")
@PreAuthorize("denyAll()")
public class ZorrianaControllers {

    @Autowired
    private IArticulosService articulosService;

    @GetMapping("/tienda")
    @PreAuthorize("permitAll()")
    public ResponseEntity<?> listarTodo() {
        var listaArticulos = articulosService.findAll();
        return listaArticulos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(IArticulosMapper.INSTANCE.toDTOListarArt(listaArticulos));
    }
}
