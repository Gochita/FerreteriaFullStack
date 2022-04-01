package com.example.Ferreteria.model.DTO;


import com.example.Ferreteria.model.FacturaModel;
import com.example.Ferreteria.model.ProductoModel;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

@Data
public class FacturaDTO {
    @Id
    private Integer idFactura;
    @NonNull private Integer consec;
    @NonNull private LocalDate fechaFactura;
    @NonNull private String nombreVendedor;
    @NonNull private String nombreCliente;
    @NonNull private String idCliente;
    @NonNull private int totalPagar;
    @NonNull private HashMap<ProductoModel,Integer> listaProductosFactura;

    public FacturaDTO(Integer consec, LocalDate fechaFactura, String nombreVendedor, String nombreCliente, String idCliente, int totalPagar, HashMap<ProductoModel, Integer> listaProductosFactura) {
        this.consec = consec;
        this.fechaFactura = fechaFactura;
        this.nombreVendedor = nombreVendedor;
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
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
        FacturaDTO that = (FacturaDTO) o;
        return totalPagar == that.totalPagar && idFactura.equals(that.idFactura) && consec.equals(that.consec) && fechaFactura.equals(that.fechaFactura) && nombreVendedor.equals(that.nombreVendedor) && nombreCliente.equals(that.nombreCliente) && idCliente.equals(that.idCliente) && listaProductosFactura.equals(that.listaProductosFactura);
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
