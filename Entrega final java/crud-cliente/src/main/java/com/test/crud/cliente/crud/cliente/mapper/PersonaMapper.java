package com.test.crud.cliente.crud.cliente.mapper;

import org.springframework.stereotype.Component;

import com.test.crud.cliente.crud.cliente.dto.PersonaDto;
import com.test.crud.cliente.crud.cliente.model.Persona;

@Component
public class PersonaMapper {

    private final ProductoMapper productoMapper;

    public PersonaMapper(ProductoMapper productoMapper) {
        this.productoMapper = productoMapper;
    }

    public static PersonaDto toDtoPersona(Persona persona) {
        if (persona == null) {
            throw new IllegalArgumentException("La entidad no puede ser nula.");
        }

        return PersonaDto.builder()
                .nombre(persona.getNombre())
                .dni(persona.getDni())
                .build();
    }

    public static Persona toEntity(PersonaDto personaDto) {
        if (personaDto == null) {
            throw new IllegalArgumentException("La entidad no puede ser nula.");
        }

        Persona persona = new Persona();
        persona.setNombre(personaDto.getNombre());
        persona.setDni(personaDto.getDni());
        return persona;
    }
}
