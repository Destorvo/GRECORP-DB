package com.bd2.grecorp.controllers;

import com.bd2.grecorp.dto.ActualizarInventarioDTO;
import com.bd2.grecorp.service.InventarioService;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grecorp/bd/inventario")
public class InventarioController {

    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @GetMapping
    public ResponseEntity<?> getAllInventario() {
        return ResponseEntity.ok(inventarioService.verInventario());
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizarInventario(@RequestBody ActualizarInventarioDTO actualizarInventarioDTO) {
        try {
            inventarioService.actualizarInventario(actualizarInventarioDTO);
            return ResponseEntity.ok("Inventario actualizado correctamente.");
        } catch (DataAccessException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: " + e.getMessage());
        }
    }
}
