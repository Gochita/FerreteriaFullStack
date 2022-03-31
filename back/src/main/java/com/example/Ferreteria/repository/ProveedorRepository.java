package com.example.Ferreteria.repository;

import com.example.Ferreteria.model.ProveedorModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProveedorRepository extends ReactiveMongoRepository<ProveedorModel, String> {
}
