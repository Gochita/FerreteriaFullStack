package com.example.Ferreteria.controller;


import com.example.Ferreteria.model.DTO.VolanteDTO;
import com.example.Ferreteria.model.VolanteModel;
import com.example.Ferreteria.services.VolanteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class VolanteController {

    @Autowired
    VolanteService volanteService;
    ModelMapper mapper;

    public VolanteController(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @PostMapping("/volantes")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<VolanteModel> save(@RequestBody VolanteDTO volanteDTO) {
        var volante = mapper.map(volanteDTO, VolanteModel.class);
        return this.volanteService.save(volante);
    }

    @GetMapping("/volantes")
    public Flux<VolanteDTO> findAll() {
        return this.volanteService.findAll()
                .flatMap(v -> Mono.just(mapper.map(v, VolanteDTO.class)));
    }

    @GetMapping("/volante/{id}")
    public Mono<VolanteDTO> findById(@PathVariable("id") String id){
        var volante = this.volanteService.findById(id)
                .flatMap(v -> Mono.just(mapper.map(v, VolanteDTO.class)));
        return volante;
    }

    @DeleteMapping("/volante/{id}")
    private Mono<ResponseEntity<VolanteModel>> delete(@PathVariable("id") String id) {
        return this.volanteService.delete(id)
                .flatMap(c -> Mono.just(ResponseEntity.ok(c)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }
}
