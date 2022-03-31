package com.example.Ferreteria.model.DTO;

import lombok.Data;

import java.util.HashMap;
import java.util.Objects;



@Data
public class InventarioDTO {
    private String idInventario;
    private HashMap<ProductoDTO, Integer> listaProductosDTO;

    public InventarioDTO(String idInventario, HashMap<ProductoDTO, Integer> listaProductosDTO) {
        this.idInventario = idInventario;
        this.listaProductosDTO = listaProductosDTO;
    }

    public InventarioDTO() {
    }

    public String getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(String idInventario) {
        this.idInventario = idInventario;
    }

    public HashMap<ProductoDTO, Integer> getListaProductosDTO() {
        return listaProductosDTO;
    }

    public void setListaProductosDTO(HashMap<ProductoDTO, Integer> listaProductosDTO) {
        this.listaProductosDTO = listaProductosDTO;
    }

    @Override
    public String toString() {
        return "InventarioDTO{" +
                "idInventarioDTO='" + idInventario + '\'' +
                ", listaProductosDTO=" + listaProductosDTO +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventarioDTO that = (InventarioDTO) o;
        return Objects.equals(idInventario, that.idInventario) && Objects.equals(listaProductosDTO, that.listaProductosDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInventario, listaProductosDTO);
    }

}
