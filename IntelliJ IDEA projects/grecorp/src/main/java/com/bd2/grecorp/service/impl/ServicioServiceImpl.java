package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.dto.RegistrarServicioDTO;
import com.bd2.grecorp.dto.ServicioClienteDTO;
import com.bd2.grecorp.repositories.ServicioRepository;
import com.bd2.grecorp.service.ServicioService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ServicioServiceImpl implements ServicioService {

    private final ServicioRepository servicioRepository;

    public ServicioServiceImpl(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    @Override
    public List<ServicioClienteDTO> verServiciosCliente(String rucDni) {
        List<Object[]> resultado = servicioRepository.verServiciosCliente(rucDni);
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
    public void registrarServicioRealizado(RegistrarServicioDTO registrarServicioDTO) {
        servicioRepository.registrarServicioRealizado(
                registrarServicioDTO.getDniRuc(),
                registrarServicioDTO.getCodTrabajador(),
                registrarServicioDTO.getCodServicio(),
                registrarServicioDTO.getCosto(),
                registrarServicioDTO.getFechaRealizado(),
                registrarServicioDTO.getObservaciones()
        );
    }
}
