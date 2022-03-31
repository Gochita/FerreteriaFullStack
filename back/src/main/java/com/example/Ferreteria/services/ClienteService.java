package com.example.Ferreteria.services;

import com.example.Ferreteria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
}
