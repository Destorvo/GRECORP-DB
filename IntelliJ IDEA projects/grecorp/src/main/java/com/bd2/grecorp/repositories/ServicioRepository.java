package com.bd2.grecorp.repositories;

import com.bd2.grecorp.entities.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Integer> {

    @Procedure(procedureName = "servicios_cliente")
    List<Object[]> verServiciosCliente(@Param("c_rucdni") String rucDni);

    @Procedure(procedureName = "registrar_servicio_realizado")
    void registrarServicioRealizado(@Param("c_dni_ruc") String dniRuc,
                                           @Param("cod_trabajador") Integer codTrabajador,
                                           @Param("cod_servicio") Integer codServicio,
                                           @Param("costo") Float costo,
                                           @Param("fecha_realizado") LocalDate fechaRealizado,
                                           @Param("observaciones") String observaciones);

}
