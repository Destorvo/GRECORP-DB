package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.dto.ActualizarInventarioDTO;
import com.bd2.grecorp.dto.CotizacionPendienteFabricacionDTO;
import com.bd2.grecorp.dto.InventarioDTO;
import com.bd2.grecorp.repositories.InventarioRepository;
import com.bd2.grecorp.service.InventarioService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class InventarioServiceImpl implements InventarioService {

    private final InventarioRepository inventarioRepository;

    public InventarioServiceImpl(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    @Override
    public List<InventarioDTO> verInventario() {
        List<Object[]> resultado = inventarioRepository.verInventario();
        return resultado.stream()
                .map(objects -> new InventarioDTO(
                        (Integer) objects[0],
                        (String) objects[1],
                        (Integer) objects[2],
                        (String) objects[3],
                        (Date) objects[4]
                ))
                .toList();
    }

    @Override
    public void actualizarInventario(ActualizarInventarioDTO actualizarInventarioDTO) {
        inventarioRepository.actualizarInventario(
                actualizarInventarioDTO.getNumPieza(),
                actualizarInventarioDTO.getCantidad()        );
    }
}
