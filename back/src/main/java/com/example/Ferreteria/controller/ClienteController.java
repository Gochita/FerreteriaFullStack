package com.example.Ferreteria.controller;


import com.example.Ferreteria.model.ClienteModel;
import com.example.Ferreteria.model.DTO.ClienteDTO;
import com.example.Ferreteria.services.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ClienteController {

    @Autowired
    ModelMapper mapper;
    @Autowired
    ClienteService clienteService;

    public ClienteController(ModelMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/listarClientes")
    public Flux<ClienteDTO> findAll() {
        return this.clienteService.listarTodos().flatMap(c ->
                Mono.just(mapper.map(c, ClienteDTO.class)));

    }
    @GetMapping("/traerCliente")
    public Mono<ClienteDTO> traerCliente(String id){
        return this.clienteService.traerCliente(id)
                .flatMap(c -> Mono.just(mapper.map(c,ClienteDTO.class)));
    }

    @PostMapping("/crearCliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ClienteModel> saveClient(@RequestBody ClienteDTO clienteDTO) {
        var cliente = mapper.map(clienteDTO, ClienteModel.class);

        return this.clienteService.saveClient(cliente);

    }

    @DeleteMapping("/eliminarClientePorId/{id}")
    //@ResponseStatus(HttpStatus.OK)
    public Mono<ClienteModel> deleteCliente(@PathVariable("id") String clienteId) {
        return this.clienteService.eliminarCliente(clienteId);
    }

    @PutMapping("/actualizarCliente/{id}")
    public Mono<ClienteModel> update(@PathVariable("id") String id, @RequestBody ClienteDTO clienteDTO) {
      var cliente= mapper.map(clienteDTO, ClienteModel.class);
      return this.clienteService.actualizarCliente(id,cliente);


    }
}




