package com.example.Ferreteria.repository;

import com.example.Ferreteria.model.FacturaModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FacturaRepository extends ReactiveMongoRepository<FacturaModel, String> {
}
