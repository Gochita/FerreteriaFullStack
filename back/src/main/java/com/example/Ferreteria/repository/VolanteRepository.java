package com.example.Ferreteria.repository;

import com.example.Ferreteria.model.VolanteModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VolanteRepository extends ReactiveMongoRepository<VolanteModel, String> {
}
