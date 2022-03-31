package com.example.Ferreteria.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

@Document(collation = "Factura")
public class FacturaModel {

    @Id
    private Integer idFactura;
    private LocalDate fechaFactura;
    private String nombreVendedor;
    private String nombreCliente;
    private int totalPagar;
    private HashMap<ProductoModel,Integer> listaProductosFactura;

    public FacturaModel(Integer idFactura, LocalDate fechaFactura, String nombreVendedor, String nombreCliente, int totalPagar, HashMap<ProductoModel, Integer> listaProductosFactura) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.nombreVendedor = nombreVendedor;
        this.nombreCliente = nombreCliente;
        this.totalPagar = totalPagar;
        this.listaProductosFactura = listaProductosFactura;
    }

    public FacturaModel() {
    }

    public Integer getId() {
        return idFactura;
    }

    public void setId(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }

    public HashMap<ProductoModel, Integer> getListaProductosFactura() {
        return listaProductosFactura;
    }

    public void setListaProductosFactura(HashMap<ProductoModel, Integer> listaProductosFactura) {
        this.listaProductosFactura = listaProductosFactura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacturaModel that = (FacturaModel) o;
        return totalPagar == that.totalPagar && Objects.equals(idFactura, that.idFactura) && Objects.equals(fechaFactura, that.fechaFactura) && Objects.equals(nombreVendedor, that.nombreVendedor) && Objects.equals(nombreCliente, that.nombreCliente) && Objects.equals(listaProductosFactura, that.listaProductosFactura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, fechaFactura, nombreVendedor, nombreCliente, totalPagar, listaProductosFactura);
    }

    @Override
    public String toString() {
        return "FacturaModel{" +
                "id=" + idFactura +
                ", fechaFactura=" + fechaFactura +
                ", nombreVendedor='" + nombreVendedor + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", totalPagar=" + totalPagar +
                ", listaProductosFactura=" + listaProductosFactura +
                '}';
    }
}
