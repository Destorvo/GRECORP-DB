package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.dto.CotizacionClienteDTO;
import com.bd2.grecorp.dto.RegistrarClienteDTO;
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
    public void registrarCliente(RegistrarClienteDTO registrarClienteDTO) {
        clienteRepository.registrarCliente(
                registrarClienteDTO.getNombre(),
                registrarClienteDTO.getApellidoP(),
                registrarClienteDTO.getApellidoM(),
                registrarClienteDTO.getCorreo(),
                registrarClienteDTO.getTelefono(),
                registrarClienteDTO.getRucDni(),
                registrarClienteDTO.getDireccion()
        );
    }
}
