package com.example.Ferreteria.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document(collection = "Proveedor")
public class ProveedorModel {


    @Id
    private String idProveedor= UUID.randomUUID().toString().substring(0, 10);
    private String nombreProveedor;
    private int telefonoProveedor;
    private String cedProveedor;

    public ProveedorModel(String nombreProveedor, int telefonoProveedor, String cedProveedor) {
        this.nombreProveedor = nombreProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.cedProveedor = cedProveedor;
    }

    public ProveedorModel() {
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public int getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(int telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getCedProveedor() {
        return cedProveedor;
    }

    public void setCedProveedor(String cedProveedor) {
        this.cedProveedor = cedProveedor;
    }

    @Override
    public String toString() {
        return "ProveedorModel{" +
                "idProveedor='" + idProveedor + '\'' +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", telefonoProveedor=" + telefonoProveedor +
                ", cedProveedor='" + cedProveedor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProveedorModel that = (ProveedorModel) o;
        return telefonoProveedor == that.telefonoProveedor && Objects.equals(idProveedor, that.idProveedor) && Objects.equals(nombreProveedor, that.nombreProveedor) && Objects.equals(cedProveedor, that.cedProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProveedor, nombreProveedor, telefonoProveedor, cedProveedor);
    }
}
