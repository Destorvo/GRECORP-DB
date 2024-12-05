package com.bd2.grecorp.service;

import com.bd2.grecorp.dto.ServicioClienteDTO;
import com.bd2.grecorp.entities.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> getClientes();

    List<ServicioClienteDTO> getAllClienteServicio(String rucDni);

}
