package com.example.Ferreteria.repository;

import com.example.Ferreteria.model.ClienteModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends ReactiveMongoRepository<ClienteModel, String> {
}
