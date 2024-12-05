package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.dto.ServicioClienteDTO;
import com.bd2.grecorp.entities.Cliente;
import com.bd2.grecorp.repositories.ClienteRepository;
import com.bd2.grecorp.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public List<ServicioClienteDTO> getAllClienteServicio(String rucDni) {
        return clienteRepository.getAllClienteServicio(rucDni);
    }
}
