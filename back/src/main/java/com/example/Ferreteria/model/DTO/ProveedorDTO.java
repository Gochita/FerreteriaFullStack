package com.example.Ferreteria.model.DTO;


import lombok.Data;

import java.util.Objects;
import java.util.UUID;

@Data
public class ProveedorDTO {

    private String idProveedorDTO = UUID.randomUUID().toString().substring(0, 10);
    private String nombreProveedorDTO;
    private int telefonoProveedorDTO;
    private String cedProveedorDTO;

    public ProveedorDTO(String idProveedorDTO, String nombreProveedorDTO, int telefonoProveedorDTO, String cedProveedorDTO) {
        this.idProveedorDTO = idProveedorDTO;
        this.nombreProveedorDTO = nombreProveedorDTO;
        this.telefonoProveedorDTO = telefonoProveedorDTO;
        this.cedProveedorDTO = cedProveedorDTO;
    }

    public ProveedorDTO() {
    }

    public String getIdProveedorDTO() {
        return idProveedorDTO;
    }

    public void setIdProveedorDTO(String idProveedorDTO) {
        this.idProveedorDTO = idProveedorDTO;
    }

    public String getNombreProveedorDTO() {
        return nombreProveedorDTO;
    }

    public void setNombreProveedorDTO(String nombreProveedorDTO) {
        this.nombreProveedorDTO = nombreProveedorDTO;
    }

    public int getTelefonoProveedorDTO() {
        return telefonoProveedorDTO;
    }

    public void setTelefonoProveedorDTO(int telefonoProveedorDTO) {
        this.telefonoProveedorDTO = telefonoProveedorDTO;
    }

    public String getCedProveedorDTO() {
        return cedProveedorDTO;
    }

    public void setCedProveedorDTO(String cedProveedorDTO) {
        this.cedProveedorDTO = cedProveedorDTO;
    }

    @Override
    public String toString() {
        return "ProveedorDTO{" +
                "idProveedorDTO='" + idProveedorDTO + '\'' +
                ", nombreProveedorDTO='" + nombreProveedorDTO + '\'' +
                ", telefonoProveedorDTO=" + telefonoProveedorDTO +
                ", cedProveedorDTO='" + cedProveedorDTO + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProveedorDTO that = (ProveedorDTO) o;
        return telefonoProveedorDTO == that.telefonoProveedorDTO && Objects.equals(idProveedorDTO, that.idProveedorDTO) && Objects.equals(nombreProveedorDTO, that.nombreProveedorDTO) && Objects.equals(cedProveedorDTO, that.cedProveedorDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProveedorDTO, nombreProveedorDTO, telefonoProveedorDTO, cedProveedorDTO);
    }
}
