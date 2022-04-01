package com.example.Ferreteria.controller;


import com.example.Ferreteria.model.DTO.ProductoDTO;
import com.example.Ferreteria.model.ProductoModel;
import com.example.Ferreteria.services.ProductoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductoController {
    @Autowired
    ModelMapper mapper;
    @Autowired
    ProductoService productoService;

    public ProductoController(ModelMapper mapper) {

        this.mapper = mapper;
    }

    @PostMapping("/productos")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ProductoModel> save(@RequestBody ProductoDTO productoDTO) {
        var producto = mapper.map(productoDTO, ProductoModel.class);
        return this.productoService.saveProducto(producto);
    }

    @GetMapping("/productos")
    public Flux<ProductoDTO> findAll() {
        return this.productoService.listarProductos()
                .flatMap(c -> Mono.just(mapper.map(c, ProductoDTO.class)));
    }

    @GetMapping("/producto/{id}")
    public Mono<ProductoDTO> findById(@PathVariable("id") String id){
        var productoDTOMono = this.productoService.traerProducto(id)
                .flatMap(c -> Mono.just(mapper.map(c, ProductoDTO.class)));
        return productoDTOMono;
    }

    @PutMapping("/producto/{id}")
    private Mono<ResponseEntity<ProductoModel>> update(@PathVariable("id") String id, @RequestBody ProductoDTO productoDTO) {
        var producto = mapper.map(productoDTO, ProductoModel.class);
        return this.productoService.actualizar(id, producto)
                .flatMap(p1 -> Mono.just(ResponseEntity.ok(p1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @DeleteMapping("/producto/{id}")
    private Mono<ResponseEntity<ProductoModel>> delete(@PathVariable("id") String id) {
        return this.productoService.eliminarProductor(id)
                .flatMap(p -> Mono.just(ResponseEntity.ok(p)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }



}
