package com.bd2.grecorp.controllers;

import com.bd2.grecorp.service.ClienteService;
import com.bd2.grecorp.service.TrabajadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grecorp/bd/trabajadores")
public class TrabajadorController {

    private final TrabajadorService trabajadorService;

    public TrabajadorController(TrabajadorService trabajadorService) {
        this.trabajadorService = trabajadorService;
    }

    @GetMapping
    public ResponseEntity<?> getAllTrabajadores() {
        return ResponseEntity.ok(trabajadorService.getTrabajadores());
    }


}
