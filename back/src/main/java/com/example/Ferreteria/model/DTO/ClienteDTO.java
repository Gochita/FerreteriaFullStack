package com.example.Ferreteria.model.DTO;

import lombok.Data;

import java.util.Objects;
import java.util.UUID;

@Data
public class ClienteDTO {
    private String idClienteDTO = UUID.randomUUID().toString().substring(0, 10);
    private String nombreClienteDTO;
    private int telefonoClienteDTO;
    private String cedCliente;

    public ClienteDTO(String idClienteDTO, String nombreClienteDTO, int telefonoClienteDTO, String cedCliente) {
        this.idClienteDTO = idClienteDTO;
        this.nombreClienteDTO = nombreClienteDTO;
        this.telefonoClienteDTO = telefonoClienteDTO;
        this.cedCliente = cedCliente;
    }

    public ClienteDTO() {
    }

    public String getIdClienteDTO() {
        return idClienteDTO;
    }

    public void setIdClienteDTO(String idClienteDTO) {
        this.idClienteDTO = idClienteDTO;
    }

    public String getNombreClienteDTO() {
        return nombreClienteDTO;
    }

    public void setNombreClienteDTO(String nombreClienteDTO) {
        this.nombreClienteDTO = nombreClienteDTO;
    }

    public int getTelefonoClienteDTO() {
        return telefonoClienteDTO;
    }

    public void setTelefonoClienteDTO(int telefonoClienteDTO) {
        this.telefonoClienteDTO = telefonoClienteDTO;
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
                "idClienteDTO='" + idClienteDTO + '\'' +
                ", nombreClienteDTO='" + nombreClienteDTO + '\'' +
                ", telefonoClienteDTO=" + telefonoClienteDTO +
                ", cedCliente='" + cedCliente + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteDTO that = (ClienteDTO) o;
        return telefonoClienteDTO == that.telefonoClienteDTO && Objects.equals(idClienteDTO, that.idClienteDTO) && Objects.equals(nombreClienteDTO, that.nombreClienteDTO) && Objects.equals(cedCliente, that.cedCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClienteDTO, nombreClienteDTO, telefonoClienteDTO, cedCliente);
    }
}
