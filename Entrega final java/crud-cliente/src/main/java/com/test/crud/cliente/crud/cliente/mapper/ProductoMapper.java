package com.test.crud.cliente.crud.cliente.mapper;

//import java.util.Set;

import org.springframework.stereotype.Component;

import com.test.crud.cliente.crud.cliente.dto.ProductoDto;

import com.test.crud.cliente.crud.cliente.model.Producto;


@Component
public class ProductoMapper {

    public ProductoDto toDtoProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("La entidad no puede ser nula");
        }

        return ProductoDto.builder()
                .nombre(producto.getNombre())
                .precio(producto.getPrecio())
                .color(producto.getColor())
                .build();
    }

    public Producto toEntity(ProductoDto productoDto) {
        if (productoDto == null) {
            throw new IllegalArgumentException("El productoDto no puede ser nulo");
        }

        Producto producto = new Producto();
        producto.setNombre(productoDto.getNombre());
        producto.setPrecio(productoDto.getPrecio());
        producto.setColor(productoDto.getColor());
        return producto;
    }
}