package com.test.crud.cliente.crud.cliente.model;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
    
    
@Data   
@Entity
@Builder
@Table(name= "PRODUCTO")
public class Producto {
    
        @Id
        @GeneratedValue( strategy = GenerationType.IDENTITY)
        private Long id;
    
        @Column(name ="NOMBRE")
        private String nombre;
    
        @Column(name ="COLOR")
        private String color;

        @Column(name ="PRECIO")
        private String precio;

        @ManyToOne(fetch = FetchType.LAZY)
        private Persona persona;

        public Producto() {
        }

        public Producto(Long id, String nombre, String color, String precio, Persona persona) {
            this.id = id;
            this.nombre = nombre;
            this.color = color;
            this.precio = precio;
            this.persona = persona;
        }

        

        
    }