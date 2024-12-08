package com.bd2.grecorp.repositories;

import com.bd2.grecorp.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Procedure(procedureName = "servicios_cliente")
    List<Object[]> verServiciosCliente(@Param("c_rucdni") String rucDni);

    @Procedure(procedureName = "cotizaciones_cliente")
    List<Object[]> verCotizacionesCliente(@Param("c_rucdni") String rucDni);

    @Procedure(procedureName = "registrar_cliente")
    void registrarCliente(@Param("nombre") String nombre,
                          @Param("apellido_p") String apellidoP,
                          @Param("apellido_m") String apellidoM,
                          @Param("correo") String correo,
                          @Param("telefono") String telefono,
                          @Param("ruc_dni") String rucDni,
                          @Param("direccion") String direccion);

}
