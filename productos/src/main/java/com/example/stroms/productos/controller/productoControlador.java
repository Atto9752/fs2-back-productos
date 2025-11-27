package com.example.stroms.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stroms.productos.model.dto.producto;
import com.example.stroms.productos.service.productoService;

@RestController
@RequestMapping("/api/v1/productos")
public class productoControlador {

    //para que cuando se levante el controlador se inicie el servicio
    @Autowired
    private productoService servicio;

    public List<producto> listarProductos() {
        return servicio.listarProductos();
    }

    public producto guardarProducto(producto producto) {
        return servicio.guardarProducto(producto);
    }

    public producto buscarProducto(int id) {
        return servicio.buscarProducto(id);
    }

    public void eliminarProducto(int id) {
        servicio.eliminarProducto(id);
    }

    public producto actualizarProducto(int id, producto productoActualizado) {
        return servicio.actualizarProducto(id, productoActualizado);
    }
}
