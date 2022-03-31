package com.example.Ferreteria.repository;

import com.example.Ferreteria.model.DTO.ClienteDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClienteRepository extends ReactiveMongoRepository<ClienteDTO, String> {
}
