package com.example.Ferreteria.services;

import com.example.Ferreteria.model.ClienteModel;
import com.example.Ferreteria.model.DTO.ClienteDTO;
import com.example.Ferreteria.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    ModelMapper mapper;

    public ClienteService(ModelMapper mapper) {
        this.mapper = mapper;
    }
    public Mono<ClienteModel> save(ClienteDTO clienteDTO){
        var cliente= mapper.map(clienteDTO,ClienteModel.class);
        return this.clienteRepository.save(cliente);
    }

}
