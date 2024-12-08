package com.bd2.grecorp.controllers;

import com.bd2.grecorp.service.InventarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grecorp/bd/inventario")
public class InventarioController {

    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @GetMapping()
    public ResponseEntity<?> getAllInventario() {
        return ResponseEntity.ok(inventarioService.verInventario());
    }

}
