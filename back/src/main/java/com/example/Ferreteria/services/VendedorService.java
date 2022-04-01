package com.example.Ferreteria.services;

import com.example.Ferreteria.model.VendedorModel;
import com.example.Ferreteria.repository.VendedorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VendedorService {
    @Autowired
    VendedorRepository vendedorRepository;
    ModelMapper mapper;

    public VendedorService(ModelMapper mapper) {
        this.mapper = mapper;
    }
    public Mono<VendedorModel> saveVendedor(VendedorModel vendedorModel){
        return this.vendedorRepository.save(vendedorModel);
    }
    public Flux<VendedorModel> listarVendedores(){
        return this.vendedorRepository.findAll();
    }
    public Mono<VendedorModel> traerVendedor(String id){
        return this.vendedorRepository.findById(id);
    }
    public Mono<VendedorModel> eliminarVendedor(String id){
        return this.vendedorRepository.findById(id)
                .flatMap(v -> this.vendedorRepository.deleteById(v.getIdVendedor()).thenReturn(v));
    }

    public Mono<VendedorModel> actualizarVendedor(String id, VendedorModel vendedorModel){
        return this.vendedorRepository.findById(id)
                .flatMap(v -> {
                    v.setCedVendedor(vendedorModel.getCedVendedor());
                    v.setCelularVendedor(vendedorModel.getCelularVendedor());
                    v.setNombreVendedor(vendedorModel.getNombreVendedor());
                    return saveVendedor(v);
                })
                .switchIfEmpty(Mono.empty());
    }

}
