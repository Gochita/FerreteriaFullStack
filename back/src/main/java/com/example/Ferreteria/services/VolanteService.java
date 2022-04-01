package com.example.Ferreteria.services;


import com.example.Ferreteria.model.VolanteModel;
import com.example.Ferreteria.repository.VolanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VolanteService {
    @Autowired
    VolanteRepository volanteRepository;


    public Mono<VolanteModel> save (VolanteModel volante){
        return this.volanteRepository.save(volante);
    }

    public Flux<VolanteModel> findAll(){
        return this.volanteRepository.findAll();
    }

    public Mono<VolanteModel> findById(String id) {
        return this.volanteRepository.findById(id);
    }

    public Mono<VolanteModel> delete(String id) {
        return this.volanteRepository
                .findById(id)
                .flatMap(p -> this.volanteRepository.deleteById(p.getIdVolante()).thenReturn(p));
    }

}
