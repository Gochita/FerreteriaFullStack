package com.example.Ferreteria.services;

import com.example.Ferreteria.model.ClienteModel;
import com.example.Ferreteria.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    ModelMapper mapper;

    public ClienteService(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public Mono<ClienteModel> saveClient(ClienteModel clienteModel) {
        return this.clienteRepository.save(clienteModel);
    }

    public Flux<ClienteModel> listarTodos() {
        return this.clienteRepository.findAll();
    }
    public Mono<ClienteModel> traerCliente(String id){
        return this.clienteRepository.findById(id);
    }

    public Mono<ClienteModel> eliminarCliente(String id) {
        return this.clienteRepository.findById(id)
                .flatMap(c -> this.clienteRepository.deleteById(c.getIdCliente())
                        .thenReturn(c));


    }
        public Mono<ClienteModel> actualizarCliente(String id, ClienteModel clienteModel){
            return this.clienteRepository.findById(id)
                    .flatMap(c -> {
                        c.setNombreCliente(clienteModel.getNombreCliente());
                        c.setTelefonoCliente(clienteModel.getTelefonoCliente());
                        c.setCedCliente(clienteModel.getCedCliente());
                        return saveClient(c);
                    })
                    .switchIfEmpty(Mono.empty());
        }
    }

