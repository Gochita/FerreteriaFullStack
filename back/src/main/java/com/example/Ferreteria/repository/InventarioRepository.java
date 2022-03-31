package com.example.Ferreteria.repository;


import com.example.Ferreteria.model.InventarioModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventarioRepository extends ReactiveMongoRepository<InventarioModel, String> {
}
