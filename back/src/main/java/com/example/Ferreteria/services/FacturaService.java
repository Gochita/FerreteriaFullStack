package com.example.Ferreteria.services;


import com.example.Ferreteria.model.FacturaModel;
import com.example.Ferreteria.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FacturaService {
    @Autowired
    FacturaRepository facturaRepository;
    public Mono<FacturaModel> saveFactura (FacturaModel facturaModel){
       /*
        FacturaModel factura= new FacturaModel();
        factura.setFechaFactura(facturaModel.getFechaFactura());
        factura.setConsec(facturaModel.getConsec());
        factura.setListaProductosFactura(facturaModel.getListaProductosFactura());
        factura.setNombreCliente(facturaModel.getNombreCliente());
        factura.setNombreVendedor(facturaModel.getNombreVendedor());
        factura.setIdCliente(facturaModel.getIdCliente());
        factura.setTotalPagar(facturaModel.getTotalPagar());

        */
        return this.facturaRepository.save(facturaModel);
    }
    public Flux<FacturaModel> findAll(){
        return this.facturaRepository.findAll();
    }
    public Mono<FacturaModel> findById(String id){
        return this.facturaRepository.findById(id);
    }
    public Mono<FacturaModel> delete(String id) {
        return this.facturaRepository
                .findById(id)
                .flatMap(f -> this.facturaRepository.deleteById(f.getIdFactura()).thenReturn(f));
    }
























}

