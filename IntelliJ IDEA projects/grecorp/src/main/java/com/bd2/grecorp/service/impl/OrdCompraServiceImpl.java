package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.dto.EstadoOrdCompraDTO;
import com.bd2.grecorp.dto.RegistrarOrdCompraDTO;
import com.bd2.grecorp.repositories.OrdCompraRepository;
import com.bd2.grecorp.service.OrdCompraService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OrdCompraServiceImpl implements OrdCompraService {

    private final OrdCompraRepository ordCompraRepository;

    public OrdCompraServiceImpl(OrdCompraRepository ordCompraRepository) {
        this.ordCompraRepository = ordCompraRepository;
    }

    @Override
    public List<EstadoOrdCompraDTO> verEstadoOrdCompra(String estado) {
        List<Object[]> resultado = ordCompraRepository.verEstadoOrdCompra(estado);
        return resultado.stream()
                .map(objects -> new EstadoOrdCompraDTO(
                        (String) objects[0],
                        (String) objects[1],
                        (Integer) objects[2],
                        (Date) objects[3],
                        (Date) objects[4],
                        (String) objects[5]
                ))
                .toList();
    }

    @Override
    public void registrarOrdCompra(RegistrarOrdCompraDTO registrarOrdCompraDTO) {
        ordCompraRepository.registrarOrdenCompra(
                registrarOrdCompraDTO.getCodProveedor(),
                registrarOrdCompraDTO.getCodTrabajador(),
                registrarOrdCompraDTO.getCodPieza(),
                registrarOrdCompraDTO.getCantidad()
        );
    }
}