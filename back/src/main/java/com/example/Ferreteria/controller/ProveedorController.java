package com.example.Ferreteria.controller;

import com.example.Ferreteria.model.DTO.ProveedorDTO;
import com.example.Ferreteria.model.ProveedorModel;
import com.example.Ferreteria.services.ProveedorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProveedorController {

    @Autowired
    ModelMapper mapper;
    @Autowired
    ProveedorService proveedorService;

    @PostMapping("/crearProveedor")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ProveedorModel> save(@RequestBody ProveedorDTO proveedorDTO){
        var proveedor= mapper.map(proveedorDTO, ProveedorModel.class);
        return this.proveedorService.saveProveedor(proveedor);

    }
    @GetMapping("/listarProveedores")
    public Flux<ProveedorDTO> findAll(){
        return this.proveedorService.listarProveedores()
                .flatMap(p-> Mono.just(mapper.map(p, ProveedorDTO.class)));
    }
    @GetMapping("/traerProveedor")
    public Mono<ProveedorDTO> traerProveedor(String id){
        return this.proveedorService.traerProveedor(id)
                .flatMap(p -> Mono.just(mapper.map(p,ProveedorDTO.class)));
    }
    @DeleteMapping("/eliminarProveedor/{id}")
    public Mono<ProveedorModel> delete(@PathVariable("id")String proovedorId){
        return this.proveedorService.eliminarProveedor(proovedorId);
    }
    @PutMapping("/actualizar/{id}")
    public Mono<ProveedorModel> update(@PathVariable("id") String id,@RequestBody ProveedorDTO proveedorDTO){
        var proveedor=mapper.map(proveedorDTO, ProveedorModel.class);
        return this.proveedorService.actualizarProveedor(id,proveedor);
    }
}
