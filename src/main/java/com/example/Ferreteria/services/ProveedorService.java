package com.example.Ferreteria.services;


import com.example.Ferreteria.model.ProveedorModel;
import com.example.Ferreteria.repository.ProveedorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProveedorService {
    @Autowired
    ProveedorRepository proveedorRepository;
    @Autowired
    ModelMapper mapper;

    public ProveedorService(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public Mono<ProveedorModel> saveProveedor(ProveedorModel proveedorModel) {
        ProveedorModel proveedorModel1 = new ProveedorModel();
         proveedorModel1.setNombreProveedor(proveedorModel.getNombreProveedor());
         proveedorModel1.setTelefonoProveedor(proveedorModel.getTelefonoProveedor());
         proveedorModel1.setCedProveedor(proveedorModel.getCedProveedor());
        return this.proveedorRepository.save(proveedorModel1);
    }

    public Flux<ProveedorModel> listarProveedores() {
        return this.proveedorRepository.findAll();
    }

    public Mono<ProveedorModel> traerProveedor(String id) {
        return this.proveedorRepository.findById(id);
    }
    public Mono<ProveedorModel> eliminarProveedor(String id){
        return this.proveedorRepository.findById(id)
                .flatMap(p -> this.proveedorRepository
                        .deleteById(p.getIdProveedor())
                        .thenReturn(p));
    }

    public Mono<ProveedorModel> actualizarProveedor(String id, ProveedorModel proveedorModel){
        return this.proveedorRepository.findById(id)
                .flatMap(p ->{
                    p.setNombreProveedor(proveedorModel.getNombreProveedor());
                    p.setCedProveedor(proveedorModel.getCedProveedor());
                    p.setTelefonoProveedor(proveedorModel.getTelefonoProveedor());
                    return saveProveedor(p);
                })
                .switchIfEmpty(Mono.empty());
    }


}
