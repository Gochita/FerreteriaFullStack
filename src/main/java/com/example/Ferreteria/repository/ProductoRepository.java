package com.example.Ferreteria.repository;

import com.example.Ferreteria.model.ProductoModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository  extends ReactiveMongoRepository<ProductoModel, String> {
}
