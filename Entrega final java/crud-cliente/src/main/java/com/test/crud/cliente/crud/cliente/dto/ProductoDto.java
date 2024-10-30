package com.test.crud.cliente.crud.cliente.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductoDto {

    private String nombre;
    private String color;
    private String precio;
    
    public ProductoDto() {
    }

    public ProductoDto(String nombre, String color, String precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }
    
    

}
