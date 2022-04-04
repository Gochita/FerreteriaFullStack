package com.example.Ferreteria.repository;


import com.example.Ferreteria.model.VendedorModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VendedorRepository extends ReactiveMongoRepository<VendedorModel, String> {
}
