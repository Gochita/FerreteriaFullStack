package com.example.Ferreteria.services;

import com.example.Ferreteria.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;
}
