package com.example.Ferreteria.services;


import com.example.Ferreteria.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorService {
    @Autowired
    ProveedorRepository proveedorRepository;
}
