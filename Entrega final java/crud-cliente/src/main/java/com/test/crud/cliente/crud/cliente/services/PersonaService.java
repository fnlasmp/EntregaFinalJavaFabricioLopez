package com.test.crud.cliente.crud.cliente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.crud.cliente.crud.cliente.dto.PersonaDto;
import com.test.crud.cliente.crud.cliente.mapper.PersonaMapper;
import com.test.crud.cliente.crud.cliente.model.Persona;
import com.test.crud.cliente.crud.cliente.repository.PersonaRepository;


@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaDto guardarPersona(PersonaDto personaDto){
        if (personaDto == null){
            throw new RuntimeException("La persona no puede ser null");
        }else if(personaRepository.existsByDni(personaDto.getDni())){
            throw new RuntimeException("La persona ya existe");
        }
        Persona personaEntity = PersonaMapper.toEntity(personaDto);
        this.personaRepository.save(personaEntity);
        return personaDto;
    }

    public List<Persona> obtenerPersona() {
        return personaRepository.findAll();
    }

    public Persona obtenerPersonaPorId(int id) {
        return personaRepository.findById(id).orElse(null);
    }

    public void eliminarPersona(int id) {
        personaRepository.deleteById(id);
    }

    public void agregarPersona(Persona persona) {
        this.personaRepository.save(persona);
    }

}

