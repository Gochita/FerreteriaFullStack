package com.example.Ferreteria.controller;


import com.example.Ferreteria.model.DTO.FacturaDTO;
import com.example.Ferreteria.model.FacturaModel;
import com.example.Ferreteria.services.FacturaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FacturaController {
    @Autowired
    FacturaService facturaService;
    ModelMapper mapper;


    public FacturaController(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @PostMapping("/facturas")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<FacturaModel> save(@RequestBody FacturaDTO facturaDTO) {
        var factura = mapper.map(facturaDTO, FacturaModel.class);
        return this.facturaService.saveFactura(factura);
    }
    @GetMapping("/facturas")
    public Flux<FacturaDTO> findAll() {
        return this.facturaService.findAll()
                .flatMap(f -> Mono.just(mapper.map(f, FacturaDTO.class)));
    }

    @GetMapping("/factura/{id}")
    public Mono<FacturaDTO> findById(@PathVariable("id") String id){
        var facturaDTOMono = this.facturaService.findById(id)
                .flatMap(c -> Mono.just(mapper.map(c, FacturaDTO.class)));
        return facturaDTOMono;
    }

    @DeleteMapping("/factura/{id}")
    private Mono<ResponseEntity<FacturaModel>> delete(@PathVariable("id") String id) {
        return this.facturaService.delete(id)
                .flatMap(f -> Mono.just(ResponseEntity.ok(f)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }
}
