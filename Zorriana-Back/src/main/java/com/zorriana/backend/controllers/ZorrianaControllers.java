package com.zorriana.backend.controllers;

import com.zorriana.backend.articulos.dto.ListarArticulos;
import com.zorriana.backend.articulos.mapper.IArticulosMapper;
import com.zorriana.backend.articulos.service.IArticulosService;
import com.zorriana.backend.categorias.dto.ListarCategorias;
import com.zorriana.backend.categorias.mapper.ICategoriasMapper;
import com.zorriana.backend.categorias.service.ICategoriasService;
import com.zorriana.backend.categoriasArticulos.dto.IProductosCategoria;
import com.zorriana.backend.categoriasArticulos.service.ICategoriasArticulosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/zorriana/tienda")
@PreAuthorize("denyAll()")
public class ZorrianaControllers {

    Logger logger = LoggerFactory.getLogger(ZorrianaControllers.class);

    @Autowired
    private  IArticulosService articulosService;
    @Autowired
    private  ICategoriasArticulosService categoriasArticulosService; // para productos
    @Autowired
    private  ICategoriasService categoriasService; // para categorias

    // listar todos los productos
    @GetMapping("/productos")
    @PreAuthorize("permitAll()")
    public ResponseEntity<List<ListarArticulos>> listarTodo() {
        var listaArticulos = articulosService.findAll();
        return listaArticulos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(IArticulosMapper.INSTANCE.toDTOListarArt(listaArticulos));
    }

    // listar categorias
    @GetMapping("/categorias")
    @PreAuthorize("permitAll()")
    public ResponseEntity<List<ListarCategorias>> listarCategorias() {
        var listaCategorias = categoriasService.findAll();
        return listaCategorias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(ICategoriasMapper.INSTANCE.toDTOListarCategorias(listaCategorias));
    }

    // listar productos por categoria
    @GetMapping("/categorias/{categoria}")
    @PreAuthorize("permitAll()")
    public ResponseEntity<List<IProductosCategoria>> listarProductosCategoria(@PathVariable String categoria) {
        var productosXCategoria = categoriasArticulosService.findByArticulosXCategoria(categoria);
        return productosXCategoria.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(productosXCategoria);
    }
}
