package com.zorriana.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zorriana")
public class ZorrianaControllers {

    @GetMapping("/tienda")
    public ResponseEntity<?> hola() {
        return ResponseEntity.ok("Bienvenidos a todos");
    }

    @GetMapping("/admin")
    public ResponseEntity<?> seguridad() {
        return ResponseEntity.ok("Bienvenido ADMIN");
    }
}
