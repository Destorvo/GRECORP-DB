package com.bd2.grecorp.controllers;

import com.bd2.grecorp.dto.RegistrarOrdCompraDTO;
import com.bd2.grecorp.service.OrdCompraService;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/grecorp/bd/ordcompra")
public class OrdCompraController {

    private final OrdCompraService ordCompraService;

    public OrdCompraController(OrdCompraService ordCompraService) {
        this.ordCompraService = ordCompraService;
    }

    @GetMapping("/{estado}")
    public ResponseEntity<?> getEstadoOrdCompra(@PathVariable String estado) {
        return ResponseEntity.ok(ordCompraService.verEstadoOrdCompra(estado));
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> nuevaOrdCompra(@RequestBody RegistrarOrdCompraDTO registrarOrdCompraDTO) {
        try {
            ordCompraService.registrarOrdCompra(
                    registrarOrdCompraDTO.getCodProveedor(),
                    registrarOrdCompraDTO.getCodTrabajador(),
                    registrarOrdCompraDTO.getCodPieza(),
                    registrarOrdCompraDTO.getCantidad()
            );
            return ResponseEntity.ok("Orden de compra registrada exitosamente.");
        } catch (DataAccessException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: " + e.getMessage());
        }
    }


}
