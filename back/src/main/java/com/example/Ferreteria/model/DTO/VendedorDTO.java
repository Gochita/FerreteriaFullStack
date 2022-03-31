package com.example.Ferreteria.model.DTO;


import lombok.Data;

import java.util.Objects;
import java.util.UUID;

@Data
public class VendedorDTO {


    private String idVendedor= UUID.randomUUID().toString().substring(0, 10);
    private String nombreVendedorDTO;
    private int celularVendedorDTO;
    private String cedVendedorDTO;

    public VendedorDTO(String idVendedor, String nombreVendedorDTO, int celularVendedorDTO, String cedVendedorDTO) {
        this.idVendedor = idVendedor;
        this.nombreVendedorDTO = nombreVendedorDTO;
        this.celularVendedorDTO = celularVendedorDTO;
        this.cedVendedorDTO = cedVendedorDTO;
    }

    public VendedorDTO() {
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNombreVendedorDTO() {
        return nombreVendedorDTO;
    }

    public void setNombreVendedorDTO(String nombreVendedorDTO) {
        this.nombreVendedorDTO = nombreVendedorDTO;
    }

    public int getCelularVendedorDTO() {
        return celularVendedorDTO;
    }

    public void setCelularVendedorDTO(int celularVendedorDTO) {
        this.celularVendedorDTO = celularVendedorDTO;
    }

    public String getCedVendedorDTO() {
        return cedVendedorDTO;
    }

    public void setCedVendedorDTO(String cedVendedorDTO) {
        this.cedVendedorDTO = cedVendedorDTO;
    }

    @Override
    public String toString() {
        return "VendedorDTO{" +
                "idVendedor='" + idVendedor + '\'' +
                ", nombreVendedorDTO='" + nombreVendedorDTO + '\'' +
                ", celularVendedorDTO=" + celularVendedorDTO +
                ", cedVendedorDTO='" + cedVendedorDTO + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendedorDTO that = (VendedorDTO) o;
        return celularVendedorDTO == that.celularVendedorDTO && Objects.equals(idVendedor, that.idVendedor) && Objects.equals(nombreVendedorDTO, that.nombreVendedorDTO) && Objects.equals(cedVendedorDTO, that.cedVendedorDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVendedor, nombreVendedorDTO, celularVendedorDTO, cedVendedorDTO);
    }
}
