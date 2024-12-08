package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.dto.CotizacionClienteDTO;
import com.bd2.grecorp.dto.ServicioClienteDTO;
import com.bd2.grecorp.entities.Cliente;
import com.bd2.grecorp.repositories.ClienteRepository;
import com.bd2.grecorp.service.ClienteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
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
    public List<CotizacionClienteDTO> verCotizacionesCliente(String rucDni) {
        List<Object[]> resultado = clienteRepository.verCotizacionesCliente(rucDni);
        return resultado.stream()
                .map(objects -> new CotizacionClienteDTO(
                        (String) objects[0],
                        (String) objects[1],
                        (String) objects[2],
                        (Integer) objects[3],
                        (String) objects[4],
                        (Date) objects[5],
                        (String) objects[6]
                ))
                .toList();
    }

    @Override
    public List<ServicioClienteDTO> verServiciosCliente(String rucDni) {
        List<Object[]> resultado = clienteRepository.verServiciosCliente(rucDni);
        return resultado.stream()
                .map(objects -> new ServicioClienteDTO(
                        (String) objects[0],
                        (String) objects[1],
                        (String) objects[2],
                        (Float) objects[3],
                        (Date) objects[4],
                        (String) objects[5],
                        (String) objects[6]
                ))
                .toList();
    }

    @Override
    public void registrarCliente(String nombre, String apellidoP, String apellidoM, String correo, String telefono, String rucDni, String direccion) {
        clienteRepository.registrarCliente(nombre, apellidoP, apellidoM, correo, telefono, rucDni, direccion);
    }
}
