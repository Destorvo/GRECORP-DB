package com.bd2.grecorp.service;

import com.bd2.grecorp.dto.RegistrarServicioDTO;
import com.bd2.grecorp.dto.ServicioClienteDTO;

import java.util.List;

public interface ServicioService {

    List<ServicioClienteDTO> verServiciosCliente(String rucDni);

    void registrarServicioRealizado(RegistrarServicioDTO registrarServicioDTO);
}
