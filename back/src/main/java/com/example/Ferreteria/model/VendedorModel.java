package com.example.Ferreteria.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document(collation = "Vendedor")
public class VendedorModel {

    @Id
    private String idVendedor= UUID.randomUUID().toString().substring(0, 10);
    private String nombreVendedor;
    private int celularVendedor;
    private String cedVendedor;


    public VendedorModel(String idVendedor, String nombreVendedor, int celularVendedor, String cedVendedor) {
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
        this.celularVendedor = celularVendedor;
        this.cedVendedor = cedVendedor;
    }

    public VendedorModel() {
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public int getCelularVendedor() {
        return celularVendedor;
    }

    public void setCelularVendedor(int celularVendedor) {
        this.celularVendedor = celularVendedor;
    }

    public String getCedVendedor() {
        return cedVendedor;
    }

    public void setCedVendedor(String cedVendedor) {
        this.cedVendedor = cedVendedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendedorModel that = (VendedorModel) o;
        return celularVendedor == that.celularVendedor && Objects.equals(idVendedor, that.idVendedor) && Objects.equals(nombreVendedor, that.nombreVendedor) && Objects.equals(cedVendedor, that.cedVendedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVendedor, nombreVendedor, celularVendedor, cedVendedor);
    }

    @Override
    public String toString() {
        return "VendedorModel{" +
                "idVendedor='" + idVendedor + '\'' +
                ", nombreVendedor='" + nombreVendedor + '\'' +
                ", celularVendedor=" + celularVendedor +
                ", cedVendedor='" + cedVendedor + '\'' +
                '}';
    }
}
