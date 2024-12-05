package com.bd2.grecorp.repositories;

import com.bd2.grecorp.dto.ProveedorOrdCompPendienteDTO;
import com.bd2.grecorp.dto.ServicioClienteDTO;
import com.bd2.grecorp.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("SELECT new com.bd2.grecorp.dto.ServicioClienteDTO( " +
            "CONCAT(c.nombre, ' ', c.apellidoP, ' ', c.apellidoM), c.correo, s.descripcion, rs.costo, rs.fechaRealizado," +
            "CONCAT(t.nombre, ' ', t.apellidoP, ' ', t.apellidoM), rs.observaciones) " +
            "FROM Cliente c " +
            "JOIN RealizarServicio rs ON c.codCliente = rs.cliente.codCliente " +
            "JOIN Trabajador t ON t.codTrabajador = rs.trabajador.codTrabajador " +
            "JOIN Servicio s ON rs.servicio.codServicio = s.codServicio " +
            "WHERE c.rucDni = ?1")
    List<ServicioClienteDTO> getAllClienteServicio(String rucDni);

}
