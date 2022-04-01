package com.example.Ferreteria.model;


import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

@Document(collection = "Factura")
public class FacturaModel {

    @Id
    private String idFactura= UUID.randomUUID().toString().substring(0, 10);
    @NonNull private Integer consec;
    @NonNull private LocalDate fechaFactura;
    @NonNull private String nombreVendedor;
    @NonNull private String nombreCliente;
    @NonNull private String idCliente;
    @NonNull private Integer totalPagar;
    @NonNull private HashMap<String,Integer> listaProductosFactura;

    public FacturaModel(@NonNull Integer consec, @NonNull LocalDate fechaFactura, @NonNull String nombreVendedor, @NonNull String nombreCliente, @NonNull String idCliente, @NonNull Integer totalPagar, @NonNull HashMap<String, Integer> listaProductosFactura) {
        this.consec = consec;
        this.fechaFactura = fechaFactura;
        this.nombreVendedor = nombreVendedor;
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.totalPagar = totalPagar;
        this.listaProductosFactura = listaProductosFactura;
    }

    public FacturaModel() {
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
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

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Integer totalPagar) {
        this.totalPagar = totalPagar;
    }

    public HashMap<String, Integer> getListaProductosFactura() {
        return listaProductosFactura;
    }

    public void setListaProductosFactura(HashMap<String, Integer> listaProductosFactura) {
        this.listaProductosFactura = listaProductosFactura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacturaModel that = (FacturaModel) o;
        return totalPagar == that.totalPagar && Objects.equals(idFactura, that.idFactura) && Objects.equals(consec, that.consec) && Objects.equals(fechaFactura, that.fechaFactura) && Objects.equals(nombreVendedor, that.nombreVendedor) && Objects.equals(nombreCliente, that.nombreCliente) && Objects.equals(idCliente, that.idCliente) && Objects.equals(listaProductosFactura, that.listaProductosFactura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, consec, fechaFactura, nombreVendedor, nombreCliente, idCliente, totalPagar, listaProductosFactura);
    }

    @Override
    public String toString() {
        return "FacturaModel{" +
                "idFactura=" + idFactura +
                ", consec=" + consec +
                ", fechaFactura=" + fechaFactura +
                ", nombreVendedor='" + nombreVendedor + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", idCliente='" + idCliente + '\'' +
                ", totalPagar=" + totalPagar +
                ", listaProductosFactura=" + listaProductosFactura +
                '}';
    }
}
