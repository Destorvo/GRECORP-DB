package com.bd2.grecorp.service;

import com.bd2.grecorp.dto.CotizacionClienteDTO;
import com.bd2.grecorp.dto.RegistrarClienteDTO;
import com.bd2.grecorp.dto.ServicioClienteDTO;
import com.bd2.grecorp.entities.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> getClientes();

    List<CotizacionClienteDTO> verCotizacionesCliente(String rucDni);

    void registrarCliente(RegistrarClienteDTO registrarClienteDTO);

}
