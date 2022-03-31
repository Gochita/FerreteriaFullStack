package com.example.Ferreteria.repository;

import com.example.Ferreteria.model.DTO.ProductoDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoRepository  extends ReactiveMongoRepository<ProductoDTO, String> {
}
