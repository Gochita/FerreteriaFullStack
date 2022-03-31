package com.example.Ferreteria.model.DTO;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;


@Data
public class VolanteDTO {

    private String idVolante;
    private String nombreProveedor;
    private HashMap<ProductoDTO, Integer> listaProductosVolante;
    private LocalDate fecha;
    private String cedProveedor;

    public VolanteDTO(String idVolante, String nombreProveedor, HashMap<ProductoDTO, Integer> listaProductosVolante, LocalDate fecha, String cedProveedor) {
        this.idVolante = idVolante;
        this.nombreProveedor = nombreProveedor;
        this.listaProductosVolante = listaProductosVolante;
        this.fecha = fecha;
        this.cedProveedor = cedProveedor;
    }

    public VolanteDTO() {
    }

    public String getIdVolante() {
        return idVolante;
    }

    public void setIdVolante(String idVolante) {
        this.idVolante = idVolante;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public HashMap<ProductoDTO, Integer> getListaProductosVolante() {
        return listaProductosVolante;
    }

    public void setListaProductosVolante(HashMap<ProductoDTO, Integer> listaProductosVolante) {
        this.listaProductosVolante = listaProductosVolante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCedProveedor() {
        return cedProveedor;
    }

    public void setCedProveedor(String cedProveedor) {
        this.cedProveedor = cedProveedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VolanteDTO that = (VolanteDTO) o;
        return Objects.equals(idVolante, that.idVolante) && Objects.equals(nombreProveedor, that.nombreProveedor) && Objects.equals(listaProductosVolante, that.listaProductosVolante) && Objects.equals(fecha, that.fecha) && Objects.equals(cedProveedor, that.cedProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVolante, nombreProveedor, listaProductosVolante, fecha, cedProveedor);
    }

    @Override
    public String toString() {
        return "VolanteDTO{" +
                "idVolanteDTO='" + idVolante + '\'' +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", listaProductosDTO=" + listaProductosVolante +
                ", fecha=" + fecha +
                ", cedProveedor='" + cedProveedor + '\'' +
                '}';
    }

}
