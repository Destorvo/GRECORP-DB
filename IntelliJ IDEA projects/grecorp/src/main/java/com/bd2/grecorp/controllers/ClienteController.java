package com.bd2.grecorp.controllers;

import com.bd2.grecorp.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public ResponseEntity<?> getAllServiciosClienteDniRuc(@PathVariable String dniRuc) {
        return ResponseEntity.ok(clienteService.getAllClienteServicio(dniRuc));
    }

}
