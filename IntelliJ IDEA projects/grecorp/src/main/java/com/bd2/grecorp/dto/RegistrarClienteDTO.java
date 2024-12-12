package com.bd2.grecorp.dto;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RegistrarClienteDTO {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    @Email(message = "El correo debe ser valido")
    private String correo;
    private String telefono;
    private String rucDni;
    private String direccion;
}
