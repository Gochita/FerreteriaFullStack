package com.example.Ferreteria.services;


import com.example.Ferreteria.model.ProductoModel;
import com.example.Ferreteria.repository.ProductoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ProductoService  {
    @Autowired
    ProductoRepository productoRepository;
    ModelMapper mapper;

    public ProductoService(ModelMapper mapper) {
        this.mapper = mapper;
    }
    public Mono<ProductoModel> saveProducto(ProductoModel productoModel){
        return this.productoRepository.save(productoModel);
    }
    public Flux<ProductoModel> listarProductos(){
        return this.productoRepository.findAll();
    }

    public Mono<ProductoModel>traerProducto(String id){
        return this.productoRepository.findById(id);
    }

    public Mono<ProductoModel> eliminarProductor(String id){
        return this.productoRepository.findById(id)
                .flatMap(p -> this.productoRepository.deleteById(p.getIdProducto())
                        .thenReturn(p));

    }

   public Mono<ProductoModel> actualizar(String id, ProductoModel productoModel){
        return this.productoRepository.findById(id)
                .flatMap(p -> {
                    p.setNombreProducto(productoModel.getNombreProducto());
                    p.setPrecioProducto(productoModel.getPrecioProducto());
                    p.setIdProveedor(productoModel.getIdProveedor());
                    p.setStock(productoModel.getStock());
                    return saveProducto(p);
                })
                .switchIfEmpty(Mono.empty());
   }

}
