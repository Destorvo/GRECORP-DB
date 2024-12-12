package com.bd2.grecorp.controllers;

import com.bd2.grecorp.dto.RegistrarClienteDTO;
import com.bd2.grecorp.service.ClienteService;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grecorp/bd/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<?> getClientes() {
        return ResponseEntity.ok(clienteService.getClientes());
    }

    @GetMapping("/cotizaciones/{dniRuc}")
    public ResponseEntity<?> getAllCotizacionesCliente(@PathVariable String dniRuc) {
        return ResponseEntity.ok(clienteService.verCotizacionesCliente(dniRuc));
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> registrarCliente(@RequestBody RegistrarClienteDTO registrarClienteDTO) {
        try {
            clienteService.registrarCliente(registrarClienteDTO);
            return ResponseEntity.ok("Cliente registrado correctamente.");
        } catch (DataAccessException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: " + e.getMessage());
        }
    }

}
