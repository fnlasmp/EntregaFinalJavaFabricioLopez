package com.test.crud.cliente.crud.cliente.model;


import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;


@Data
@Entity
@Builder
@Table(name= "PERSONA")
public class Persona {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="NOMBRE")
    private String nombre;

    @Column(name = "DNI")
    private long dni;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Producto> producto;

    public Persona() {
    }

    public Persona(int id, String nombre, long dni, List<Producto> producto) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.producto = producto;
    }

    

}

