package com.bd2.grecorp.repositories;

import com.bd2.grecorp.entities.Cotizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CotizacionRepository extends JpaRepository<Cotizacion, Integer> {

    @Procedure(procedureName = "cotizaciones_pendientes_fabricacion")
    List<Object[]> verCotizacionesPendientesFabricacion();

}
