package com.bd2.grecorp.controllers;

import com.bd2.grecorp.dto.RegistrarCompraDTO;
import com.bd2.grecorp.service.CompraService;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grecorp/bd/compra")
public class CompraController {
    private final CompraService compraService;

    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> nuevaOrdCompra(@RequestBody RegistrarCompraDTO registrarCompraDTO) {
        try {
            compraService.registrarCompra(
                    registrarCompraDTO.getNumOrdCompra(),
                    registrarCompraDTO.getCodMP(),
                    registrarCompraDTO.getObservaciones()
            );
            return ResponseEntity.ok("Compra registrada exitosamente.");
        } catch (DataAccessException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: " + e.getMessage());
        }
    }

}
