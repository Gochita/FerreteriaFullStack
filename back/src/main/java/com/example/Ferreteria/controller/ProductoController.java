package com.example.Ferreteria.controller;


import com.example.Ferreteria.model.DTO.ProductoDTO;
import com.example.Ferreteria.model.ProductoModel;
import com.example.Ferreteria.services.ProductoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductoController {
    @Autowired
    ModelMapper mapper;
    ProductoService productoService;

    public ProductoController(ModelMapper mapper) {

        this.mapper = mapper;
    }
    @PostMapping("/crearProducto")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ProductoModel> save(@RequestBody ProductoDTO productoDTO){
        var producto= mapper.map(productoDTO, ProductoModel.class);
        return this.productoService.saveProducto(producto);
    }
    @GetMapping("/listarProductos")
    public Flux<ProductoDTO> findAll(){
        return this.productoService.listarProductos().flatMap(p ->
                Mono.just(mapper.map(p,ProductoDTO.class)));
    }
    @GetMapping("/traerProducto")
    public Mono<ProductoDTO> traerProducto(String id){
        return this.productoService.traerProducto(id)
                .flatMap(p-> Mono.just(mapper.map(p,ProductoDTO.class)));
    }
    @DeleteMapping("/eliminarPorId/{id}")
    public Mono<ProductoModel> delete(@PathVariable("id") String productoId){
        return this.productoService.eliminarProductor(productoId);
    }
    @PutMapping("/actualizarProducto/{id}")
    public Mono<ProductoModel> update(@PathVariable("id") String id, @RequestBody ProductoDTO productoDTO){
        var producto= mapper.map(productoDTO, ProductoModel.class);
        return this.productoService.actualizar(id,producto);

    }

}
