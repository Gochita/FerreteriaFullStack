package com.example.Ferreteria.model;


import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Document(collection = "Volante")
public class VolanteModel {

    @Id
    private String idVolante= UUID.randomUUID().toString().substring(0, 10);
    @NonNull private String nombreProveedor;
    @NonNull private List<ProductoModel> listaProductosVolante;
    @NonNull private LocalDate fecha;
    @NonNull private String cedProveedor;

    public VolanteModel( String nombreProveedor,List<ProductoModel> listaProductosVolante, LocalDate fecha, String cedProveedor) {
        this.nombreProveedor = nombreProveedor;
        this.listaProductosVolante = listaProductosVolante;
        this.fecha = fecha;
        this.cedProveedor = cedProveedor;
    }

    public VolanteModel() {
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

    public List<ProductoModel> getListaProductosVolante() {
        return listaProductosVolante;
    }

    public void setListaProductosVolante(List<ProductoModel>listaProductosVolante) {
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
    public String toString() {
        return "VolanteModel{" +
                "idVolante='" + idVolante + '\'' +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                ", listaProductosVolante=" + listaProductosVolante +
                ", fecha=" + fecha +
                ", cedProveedor='" + cedProveedor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VolanteModel that = (VolanteModel) o;
        return Objects.equals(idVolante, that.idVolante) && Objects.equals(nombreProveedor, that.nombreProveedor) && Objects.equals(listaProductosVolante, that.listaProductosVolante) && Objects.equals(fecha, that.fecha) && Objects.equals(cedProveedor, that.cedProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVolante, nombreProveedor, listaProductosVolante, fecha, cedProveedor);
    }
}
