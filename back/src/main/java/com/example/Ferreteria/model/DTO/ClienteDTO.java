package com.example.Ferreteria.model.DTO;

import lombok.Data;

import java.util.Objects;


public class ClienteDTO {
    private String idCliente;
    private String nombreCliente;
    private int telefonoCliente;
    private String cedCliente;

    public ClienteDTO( String nombreCliente, int telefonoCliente, String cedCliente) {
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.cedCliente = cedCliente;
    }

    public ClienteDTO() {
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
    public String toString() {
        return "ClienteDTO{" +
                "idClienteDTO='" + idCliente + '\'' +
                ", nombreClienteDTO='" + nombreCliente + '\'' +
                ", telefonoClienteDTO=" + telefonoCliente +
                ", cedCliente='" + cedCliente + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteDTO that = (ClienteDTO) o;
        return telefonoCliente == that.telefonoCliente && Objects.equals(idCliente, that.idCliente) && Objects.equals(nombreCliente, that.nombreCliente) && Objects.equals(cedCliente, that.cedCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombreCliente, telefonoCliente, cedCliente);
    }
}
