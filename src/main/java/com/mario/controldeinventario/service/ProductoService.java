package com.mario.controldeinventario.service;

import com.mario.controldeinventario.entity.Producto;
import com.mario.controldeinventario.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;
    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    //Llama al metodo del repositorio que muestra la lista de todos los productos
    public List<Producto> findAllProductos(){
        return productoRepository.findAll();
    }

    //Lama al metodo del repositorio que busca en la base de datos el elemento que tiene el ID proporcionado
    public Producto findProductoById(Long id){
        return productoRepository.findById(id).orElse(null);
    }

    //Llama al metodo del repositorio que guarda un producto nuevo en la base de datos
    public Producto addProducto(Producto producto){
        return productoRepository.save(producto);
    }

    //Busca por id el producto al que le va a pasar los nuevos atributos y en el caso de que exista llamara al metodo del repositorio para guardar el producto actualizado
    public Producto updateProducto(Long id, Producto producto){
        if (productoRepository.existsById(id)){
            producto.setId(id);
            return productoRepository.save(producto);
        }else {
            throw new IllegalArgumentException("No hay un producto con un id " + id);
        }
    }

    //LLama al metodo del repositorio que permite buscar un producto por su id y eliminarlo de la base de datos
    public void deleteProductoById(Long id){
        productoRepository.deleteById(id);
    }

}
