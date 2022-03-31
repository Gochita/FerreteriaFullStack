package com.example.Ferreteria.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document(collection = "Cliente")
public class ClienteModel {

    @Id
    private String idCliente= UUID.randomUUID().toString().substring(0, 10);

    private String nombreCliente;
    private int telefonoCliente;
    private String cedCliente;

    public ClienteModel( String nombreCliente, int telefono, String cedCliente) {

        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefono;
        this.cedCliente = cedCliente;
    }

    public ClienteModel() {
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(String cedCliente) {
        this.cedCliente = cedCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteModel that = (ClienteModel) o;
        return telefonoCliente == that.telefonoCliente && Objects.equals(idCliente, that.idCliente) && Objects.equals(nombreCliente, that.nombreCliente) && Objects.equals(cedCliente, that.cedCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombreCliente, telefonoCliente, cedCliente);
    }

    @Override
    public String toString() {
        return "ClienteModel{" +
                "idCliente='" + idCliente + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", telefonoCliente=" + telefonoCliente +
                ", cedCliente='" + cedCliente + '\'' +
                '}';
    }
}
