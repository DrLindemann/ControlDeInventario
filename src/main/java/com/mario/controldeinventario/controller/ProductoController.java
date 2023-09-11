package com.mario.controldeinventario.controller;


import com.mario.controldeinventario.entity.Producto;
import com.mario.controldeinventario.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    //Recogera las peticiones GET y enviara una lista con todos los productos llamando al servicio
    @GetMapping("/")
    public List<Producto> findAllProductos(){
        return productoService.findAllProductos();
    }

    //Al hacer la peticion GET con su id, llamara al metodo del servicio que se  encarga de encontrar el objeto en base de datos con ese id
    @GetMapping("/{id}")
    public Producto findProductoById(@PathVariable Long id){
        return productoService.findProductoById(id);
    }

    //Al hacer una peticion POST con un json con los atributos de un nuevo objeto, llamara al metodo del servicio que guarda en la base de datos el nuevo producto
    @PostMapping("/")
    public Producto addProducto(@RequestBody Producto producto){
        return productoService.addProducto(producto);
    }

    //Al hacer la peticion PUT añadiendo a la URL el id del producto que deseamos actualizar y pasandole el json con los nuevos atributos, este llamara al metodo del servicio que se encarga de buscar por id el producto y cambiar los valores de sus atributos por los del json enviado
    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto producto){
        return productoService.updateProducto(id, producto);
    }

    //Al hacer la peticion DELETE y añadiendo el id a la URL llama al metodo del servicio que se encarga de buscar el producto con ese id y eliminarlo de la base de datos
    @DeleteMapping("/{id}")
    public void deleteProductoById(@PathVariable Long id){
        productoService.deleteProductoById(id);
    }


}
