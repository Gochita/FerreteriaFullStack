package com.example.Ferreteria.repository;

import com.example.Ferreteria.model.DTO.ProveedorDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProveedorRepository extends ReactiveMongoRepository<ProveedorDTO, String> {
}
