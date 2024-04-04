package com.zorriana.backend.controllers;

import com.zorriana.backend.articulos.mapper.IArticulosMapper;
import com.zorriana.backend.articulos.service.IArticulosService;
import com.zorriana.backend.categoriasArticulos.service.ICategoriasArticulosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zorriana/tienda")
@PreAuthorize("denyAll()")
public class ZorrianaControllers {

    Logger logger = LoggerFactory.getLogger(ZorrianaControllers.class);

    @Autowired
    private IArticulosService articulosService;
    @Autowired
    private ICategoriasArticulosService categoriasArticulosService;

    // listar todos los productos
    @GetMapping("/productos")
    @PreAuthorize("permitAll()")
    public ResponseEntity<?> listarTodo() {
        var listaArticulos = articulosService.findAll();
        return listaArticulos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(IArticulosMapper.INSTANCE.toDTOListarArt(listaArticulos));
    }

    // listar categorias de productos
    @GetMapping("/categorias")
    @PreAuthorize("permitAll()")
    public ResponseEntity<?> listarCategorias() {
        var listaCategorias = categoriasArticulosService.findByNombre();
        return listaCategorias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(listaCategorias);
    }
}
