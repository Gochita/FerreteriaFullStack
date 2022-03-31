package com.example.Ferreteria.model.DTO;


import lombok.Data;

import java.util.Objects;

@Data
public class VendedorDTO {


    private String idVendedor;
    private String nombreVendedor;
    private int celularVendedor;
    private String cedVendedor;

    public VendedorDTO(String idVendedor, String nombreVendedor, int celularVendedor, String cedVendedor) {
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
        this.celularVendedor = celularVendedor;
        this.cedVendedor = cedVendedor;
    }

    public VendedorDTO() {
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
    public String toString() {
        return "VendedorDTO{" +
                "idVendedor='" + idVendedor + '\'' +
                ", nombreVendedorDTO='" + nombreVendedor + '\'' +
                ", celularVendedorDTO=" + celularVendedor +
                ", cedVendedorDTO='" + cedVendedor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendedorDTO that = (VendedorDTO) o;
        return celularVendedor == that.celularVendedor && Objects.equals(idVendedor, that.idVendedor) && Objects.equals(nombreVendedor, that.nombreVendedor) && Objects.equals(cedVendedor, that.cedVendedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVendedor, nombreVendedor, celularVendedor, cedVendedor);
    }
}
