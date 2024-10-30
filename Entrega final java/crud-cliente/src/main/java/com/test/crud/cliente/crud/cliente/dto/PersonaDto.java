package com.test.crud.cliente.crud.cliente.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class PersonaDto {

    private String nombre;
    private long dni;
    

    public PersonaDto(){

    }

    public PersonaDto(String nombre, long dni) {
        this.nombre = nombre;
        this.dni = dni;
    
    }

    
}
