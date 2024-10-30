package com.test.crud.cliente.crud.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.crud.cliente.crud.cliente.dto.PersonaDto;
import com.test.crud.cliente.crud.cliente.model.Persona;
import com.test.crud.cliente.crud.cliente.model.Producto;
import com.test.crud.cliente.crud.cliente.services.PersonaService;
import com.test.crud.cliente.crud.cliente.services.ProductoService;





@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private PersonaService personaService;
    @Autowired
    private ProductoService productoService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //creamos personas
        // Persona persona1= new Persona();
        // persona1.setNombre("Fabricio");
        // persona1.setDni(123456789);

        // Persona persona2= new Persona();
        // persona2.setNombre("Pedro");
        // persona2.setDni(987654321);

        //guardamos personas en la base de datos
        //personaService.guardarPersona(persona1);
        //personaService.guardarPersona(persona2);

        PersonaDto persona1 = new PersonaDto("Pablo", 123456789);
        PersonaDto persona2 = new PersonaDto("Lucas", 987776321);
        PersonaDto persona3 = new PersonaDto("Maria", 125645323);

        this.personaService.guardarPersona(persona1);
        this.personaService.guardarPersona(persona2);
        this.personaService.guardarPersona(persona3);



        //creamos productos
        Producto producto1= new Producto();
        producto1.setNombre("Remera");
        producto1.setColor("Rojo");
        producto1.setPrecio("1000");

        Producto producto2= new Producto();
        producto2.setNombre("Jean");
        producto2.setColor("Azul");
        producto2.setPrecio("1600");

        //guardamos en la base de datos
        productoService.agregarProducto(producto1);
        productoService.agregarProducto(producto2);

        //buscar personas
        personaService.obtenerPersona();



        System.out.println(persona1.getNombre() + " compro un/a " + producto2.getNombre() + " al precio de $" + producto2.getPrecio());
    }

    
}