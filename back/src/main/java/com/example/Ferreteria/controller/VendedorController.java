package com.example.Ferreteria.controller;


import com.example.Ferreteria.model.DTO.ClienteDTO;
import com.example.Ferreteria.model.DTO.VendedorDTO;
import com.example.Ferreteria.model.VendedorModel;
import com.example.Ferreteria.services.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class VendedorController {

    @Autowired
    VendedorService vendedorService;
    @Autowired
    ModelMapper mapper;

    public VendedorController(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/listarVendedores")
    public Flux<VendedorDTO> findAll(){
        return this.vendedorService.listarVendedores().flatMap(
                v -> Mono.just(mapper.map(v,VendedorDTO.class)));

    }
    @GetMapping("/traerVendedor")
    public Mono<VendedorDTO> traerVendedor(String id){
        return this.vendedorService.traerVendedor(id)
                .flatMap(v-> Mono.just(mapper.map(v,VendedorDTO.class )));
    }
    @PostMapping("/crearVendedor")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<VendedorModel> save(@RequestBody VendedorDTO vendedorDTO){
        var vendedor=mapper.map(vendedorDTO, VendedorModel.class);
        return this.vendedorService.save(vendedor);
    }

    @DeleteMapping("/eliminarVendedorPorId/{id}")
    public Mono<VendedorModel> delete(@PathVariable("id") String vendedorId){
        return this.vendedorService.eliminarVendedor(vendedorId);
    }

    @PutMapping("/actualizarVendedor/{id}")
    public Mono<VendedorModel> update(@PathVariable("id") String id, @RequestBody VendedorDTO vendedorDTO){
        var vendedor= mapper.map(vendedorDTO, VendedorModel.class);
        return this.vendedorService.actualizarVendedor(id,vendedor);
    }

}
