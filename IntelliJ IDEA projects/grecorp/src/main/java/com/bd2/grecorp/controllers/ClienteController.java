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

    @GetMapping("/servicios/{dniRuc}")
    public ResponseEntity<?> getAllServiciosCliente(@PathVariable String dniRuc) {
        return ResponseEntity.ok(clienteService.verServiciosCliente(dniRuc));
    }

    @GetMapping("/cotizaciones/{dniRuc}")
    public ResponseEntity<?> getAllCotizacionesCliente(@PathVariable String dniRuc) {
        return ResponseEntity.ok(clienteService.verCotizacionesCliente(dniRuc));
    }

    @PostMapping("/registrar")
    public ResponseEntity<?> registrarCliente(@RequestBody RegistrarClienteDTO registrarClienteDTO) {
        try {
            clienteService.registrarCliente(
                    registrarClienteDTO.getNombre(),
                    registrarClienteDTO.getApellidoP(),
                    registrarClienteDTO.getApellidoM(),
                    registrarClienteDTO.getCorreo(),
                    registrarClienteDTO.getTelefono(),
                    registrarClienteDTO.getRucDni(),
                    registrarClienteDTO.getDireccion()
            );
            return ResponseEntity.ok("Cliente registrado exitosamente.");
        } catch (DataAccessException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: " + e.getMessage());
        }
    }

}
