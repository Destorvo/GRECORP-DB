package com.bd2.grecorp.controllers;

import com.bd2.grecorp.dto.RegistrarServicioDTO;
import com.bd2.grecorp.service.ServicioService;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grecorp/bd/servicios")
public class ServicioController {

    private final ServicioService servicioService;

    public ServicioController(ServicioService servicioService) {
        this.servicioService = servicioService;
    }

    @GetMapping("/cliente/{dniRuc}")
    public ResponseEntity<?> getAllServiciosCliente(@PathVariable String dniRuc) {
        return ResponseEntity.ok(servicioService.verServiciosCliente(dniRuc));
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> registrarServicio(@RequestBody RegistrarServicioDTO registrarServicioDTO) {
        try {
            servicioService.registrarServicioRealizado(registrarServicioDTO);
            return ResponseEntity.ok("Se ha registrado el servicio correctamente.");
        } catch (DataAccessException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: " + e.getMessage());
        }
    }

}
