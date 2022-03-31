package com.example.Ferreteria.model.DTO;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;


@Data
public class VolanteDTO {

    private String idVolanteDTO= UUID.randomUUID().toString().substring(0, 10);
    private String nombreProveedor;
    private HashMap<ProductoDTO, Integer> listaProductosDTO;
    private LocalDate fecha;
    private String cedProveedor;

    public VolanteDTO(String idVolanteDTO, String nombreProveedor, HashMap<ProductoDTO, Integer> listaProductosDTO, LocalDate fecha, String cedProveedor) {
        this.idVolanteDTO = idVolanteDTO;
        this.nombreProveedor = nombreProveedor;
        this.listaProductosDTO = listaProductosDTO;
        this.fecha = fecha;
        this.cedProveedor = cedProveedor;
    }

    public VolanteDTO() {
    }

    public String getIdVolanteDTO() {
        return idVolanteDTO;
    }

    public void setIdVolanteDTO(String idVolanteDTO) {
        this.idVolanteDTO = idVolanteDTO;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public HashMap<ProductoDTO, Integer> getListaProductosDTO() {
        return listaProductosDTO;
    }

    public void setListaProductosDTO(HashMap<ProductoDTO, Integer> listaProductosDTO) {
        this.listaProductosDTO = listaProductosDTO;
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
        return Objects.equals(idVolanteDTO, that.idVolanteDTO) && Objects.equals(nombreProveedor, that.nombreProveedor) && Objects.equals(listaProductosDTO, that.listaProductosDTO) && Objects.equals(fecha, that.fecha) && Objects.equals(cedProveedor, that.cedProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVolanteDTO, nombreProveedor, listaProductosDTO, fecha, cedProveedor);
    }

    @Override
    public String toString() {
        return "VolanteDTO{" +
                "idVolanteDTO='" + idVolanteDTO + '\'' +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", listaProductosDTO=" + listaProductosDTO +
                ", fecha=" + fecha +
                ", cedProveedor='" + cedProveedor + '\'' +
                '}';
    }

}
