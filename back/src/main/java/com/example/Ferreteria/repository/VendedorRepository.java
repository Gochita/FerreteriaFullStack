package com.example.Ferreteria.repository;

import com.example.Ferreteria.model.DTO.VendedorDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendedorRepository extends ReactiveMongoRepository<VendedorDTO, String> {
}
