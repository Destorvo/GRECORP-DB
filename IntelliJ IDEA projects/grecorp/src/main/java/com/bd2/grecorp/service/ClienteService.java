package com.bd2.grecorp.service;

import com.bd2.grecorp.dto.CotizacionClienteDTO;
import com.bd2.grecorp.dto.ServicioClienteDTO;
import com.bd2.grecorp.entities.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> getClientes();

    List<ServicioClienteDTO> verServiciosCliente(String rucDni);

    List<CotizacionClienteDTO> verCotizacionesCliente(String rucDni);

    void registrarCliente(String nombre, String apellidoP, String apellidoM, String correo, String telefono, String rucDni, String direccion);

}
