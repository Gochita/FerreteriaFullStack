package com.example.Ferreteria.services;



import com.example.Ferreteria.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class ProductoService  {
    @Autowired
    private ProductoRepository productoRepository;


}
