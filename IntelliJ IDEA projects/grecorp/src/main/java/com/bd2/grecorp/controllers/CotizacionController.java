package com.bd2.grecorp.controllers;

import com.bd2.grecorp.service.CotizacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grecorp/bd/cotizaciones")
public class CotizacionController {

    private final CotizacionService cotizacionService;


    public CotizacionController(CotizacionService cotizacionService) {
        this.cotizacionService = cotizacionService;
    }

    @GetMapping("/fabricar")
    public ResponseEntity<?> getAllCotizacionesPendientesFabricacion() {
        return ResponseEntity.ok(cotizacionService.verCotizacionesPendientesFabricacion());
    }


}
