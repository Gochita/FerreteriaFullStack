package com.example.Ferreteria.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

@Document(collection = "Factura")
public class FacturaModel {

    @Id
    private Integer idFactura;
    private Integer consec;
    private LocalDate fechaFactura;
    private String nombreVendedor;
    private String nombreCliente;
    private int totalPagar;
    private HashMap<ProductoModel,Integer> listaProductosFactura;

    public FacturaModel(Integer consec, LocalDate fechaFactura, String nombreVendedor, String nombreCliente, int totalPagar, HashMap<ProductoModel, Integer> listaProductosFactura) {

        this.consec = consec;
        this.fechaFactura = fechaFactura;
        this.nombreVendedor = nombreVendedor;
        this.nombreCliente = nombreCliente;
        this.totalPagar = totalPagar;
        this.listaProductosFactura = listaProductosFactura;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getConsec() {
        return consec;
    }

    public void setConsec(Integer consec) {
        this.consec = consec;
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
    public String toString() {
        return "FacturaModel{" +
                "idFactura=" + idFactura +
                ", consec=" + consec +
                ", fechaFactura=" + fechaFactura +
                ", nombreVendedor='" + nombreVendedor + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", totalPagar=" + totalPagar +
                ", listaProductosFactura=" + listaProductosFactura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacturaModel that = (FacturaModel) o;
        return totalPagar == that.totalPagar && Objects.equals(idFactura, that.idFactura) && Objects.equals(consec, that.consec) && Objects.equals(fechaFactura, that.fechaFactura) && Objects.equals(nombreVendedor, that.nombreVendedor) && Objects.equals(nombreCliente, that.nombreCliente) && Objects.equals(listaProductosFactura, that.listaProductosFactura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, consec, fechaFactura, nombreVendedor, nombreCliente, totalPagar, listaProductosFactura);
    }
}
