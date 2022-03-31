package com.example.Ferreteria.model.DTO;


import lombok.Data;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

@Data
public class FacturaDTO {
    private Integer idFactura;
    private LocalDate fechaFactura;
    private String nombreVendedor;
    private String nombreCliente;
    private int totalPagar;
    private HashMap<ProductoDTO, Integer> listaProductosFactura;

    public FacturaDTO(Integer idFactura, LocalDate fechaFactura, String nombreVendedor, String nombreCliente, int totalPagar, HashMap<ProductoDTO, Integer> listaProductosFactura) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.nombreVendedor = nombreVendedor;
        this.nombreCliente = nombreCliente;
        this.totalPagar = totalPagar;
        this.listaProductosFactura = listaProductosFactura;
    }

    public FacturaDTO() {
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
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

    public HashMap<ProductoDTO, Integer> getListaProductosFactura() {
        return listaProductosFactura;
    }

    public void setListaProductosFactura(HashMap<ProductoDTO, Integer> listaProductosFactura) {
        this.listaProductosFactura = listaProductosFactura;
    }

    @Override
    public String toString() {
        return "FacturaDTO{" +
                "idFacturaDTO=" + idFactura +
                ", fechaFacturaDTO=" + fechaFactura +
                ", nombreVendedorDTO='" + nombreVendedor + '\'' +
                ", nombreClienteDTO='" + nombreCliente + '\'' +
                ", totalPagar=" + totalPagar +
                ", listaProductosFacturaDTO=" + listaProductosFactura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacturaDTO that = (FacturaDTO) o;
        return totalPagar == that.totalPagar && Objects.equals(idFactura, that.idFactura) && Objects.equals(fechaFactura, that.fechaFactura) && Objects.equals(nombreVendedor, that.nombreVendedor) && Objects.equals(nombreCliente, that.nombreCliente) && Objects.equals(listaProductosFactura, that.listaProductosFactura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFactura, fechaFactura, nombreVendedor, nombreCliente, totalPagar, listaProductosFactura);
    }
}
