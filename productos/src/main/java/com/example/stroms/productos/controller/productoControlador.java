package com.example.stroms.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.stroms.productos.model.dto.producto;
import com.example.stroms.productos.service.productoService;

@RestController
@RequestMapping("/api/v1/productos")
public class productoControlador {

    //para que cuando se levante el controlador se inicie el servicio
    @Autowired
    private productoService servicio;

    @GetMapping
    public List<producto> listarProductos() {
        return servicio.listarProductos();
    }

    @PostMapping
    public producto guardarProducto(producto producto) {
        return servicio.guardarProducto(producto);
    }

    @GetMapping("/{id}")
    public producto buscarProducto(int id) {
        return servicio.buscarProducto(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(int id) {
        servicio.eliminarProducto(id);
    }

    @PutMapping("/{id}")
    public producto actualizarProducto(int id, producto productoActualizado) {
        return servicio.actualizarProducto(id, productoActualizado);
    }
}
