package com.example.Ferreteria.model.DTO;



import lombok.NonNull;
import org.springframework.data.annotation.Id;

import java.util.Objects;



public class ProveedorDTO {
    @Id
    private String idProveedor;
    @NonNull private String nombreProveedor;
    @NonNull private int telefonoProveedor;
    @NonNull private String cedProveedor;

    public ProveedorDTO( String nombreProveedor, int telefonoProveedor, String cedProveedor) {
        this.nombreProveedor = nombreProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.cedProveedor = cedProveedor;
    }

    public ProveedorDTO() {
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
        return "ProveedorDTO{" +
                "idProveedorDTO='" + idProveedor + '\'' +
                ", nombreProveedorDTO='" + nombreProveedor + '\'' +
                ", telefonoProveedorDTO=" + telefonoProveedor +
                ", cedProveedorDTO='" + cedProveedor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProveedorDTO that = (ProveedorDTO) o;
        return telefonoProveedor == that.telefonoProveedor && Objects.equals(idProveedor, that.idProveedor) && Objects.equals(nombreProveedor, that.nombreProveedor) && Objects.equals(cedProveedor, that.cedProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProveedor, nombreProveedor, telefonoProveedor, cedProveedor);
    }
}
