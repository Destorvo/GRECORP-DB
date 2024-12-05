package com.bd2.grecorp.controllers;

import com.bd2.grecorp.service.ProveedorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grecorp/bd/proveedores")
public class ProveedorController {

    private final ProveedorService proveedorService;


    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping("ordcompra/pendientes")
    public ResponseEntity<?> getAllOrdCompraPendientes() {
        return ResponseEntity.ok(proveedorService.getAllProveedorOrdenCompraPendientes());
    }

    @GetMapping("ordcompra/aprobadas")
    public ResponseEntity<?> getAllOrdCompraAprobadas() {
        return ResponseEntity.ok(proveedorService.getAllProveedorOrdenCompraAprobadas());
    }

}
