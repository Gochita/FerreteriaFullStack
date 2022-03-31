package com.example.Ferreteria.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

@Document(collation = "Inventario")
public class InventarioModel {
    @Id
    private String idInventario= UUID.randomUUID().toString().substring(0, 10);

    private HashMap<ProductoModel,Integer> listaProductosInventario;

    public InventarioModel(String idInventario, HashMap<ProductoModel, Integer> listaProductosCantidad) {
        this.idInventario = idInventario;
        this.listaProductosInventario = listaProductosCantidad;
    }

    public InventarioModel() {
    }

    public String getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(String idInventario) {
        this.idInventario = idInventario;
    }

    public HashMap<ProductoModel, Integer> getListaProductosCantidad() {
        return listaProductosInventario;
    }

    public void setListaProductosCantidad(HashMap<ProductoModel, Integer> listaProductosCantidad) {
        this.listaProductosInventario = listaProductosCantidad;
    }

    @Override
    public String toString() {
        return "InventarioModel{" +
                "idInventario='" + idInventario + '\'' +
                ", listaProductosCantidad=" + listaProductosInventario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventarioModel that = (InventarioModel) o;
        return Objects.equals(idInventario, that.idInventario) && Objects.equals(listaProductosInventario, that.listaProductosInventario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInventario, listaProductosInventario);
    }
}
