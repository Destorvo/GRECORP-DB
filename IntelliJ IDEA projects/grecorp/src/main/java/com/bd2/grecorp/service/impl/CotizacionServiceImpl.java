package com.bd2.grecorp.service.impl;

import com.bd2.grecorp.dto.CotizacionPendienteFabricacionDTO;
import com.bd2.grecorp.dto.ServicioClienteDTO;
import com.bd2.grecorp.entities.Cotizacion;
import com.bd2.grecorp.repositories.CotizacionRepository;
import com.bd2.grecorp.service.CotizacionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CotizacionServiceImpl implements CotizacionService {

    private final CotizacionRepository cotizacionRepository;

    public CotizacionServiceImpl(CotizacionRepository cotizacionRepository) {
        this.cotizacionRepository = cotizacionRepository;
    }

    @Override
    public List<CotizacionPendienteFabricacionDTO> verCotizacionesPendientesFabricacion() {
        List<Object[]> resultado = cotizacionRepository.verCotizacionesPendientesFabricacion();
        return resultado.stream()
                .map(objects -> new CotizacionPendienteFabricacionDTO(
                        (String) objects[0],
                        (String) objects[1],
                        (String) objects[2],
                        (Integer) objects[3],
                        (Date) objects[4],
                        (String) objects[5]
                ))
                .toList();
    }
}
