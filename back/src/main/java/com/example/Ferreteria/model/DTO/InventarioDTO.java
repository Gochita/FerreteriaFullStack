package com.example.Ferreteria.model.DTO;

import com.example.Ferreteria.model.ProductoModel;
import lombok.Data;

import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;


@Data
public class InventarioDTO {
    private String idInventarioDTO= UUID.randomUUID().toString().substring(0, 10);
    private HashMap<ProductoDTO, Integer> listaProductosDTO;

    public InventarioDTO(String idInventarioDTO, HashMap<ProductoDTO, Integer> listaProductosDTO) {
        this.idInventarioDTO = idInventarioDTO;
        this.listaProductosDTO = listaProductosDTO;
    }

    public InventarioDTO() {
    }

    public String getIdInventarioDTO() {
        return idInventarioDTO;
    }

    public void setIdInventarioDTO(String idInventarioDTO) {
        this.idInventarioDTO = idInventarioDTO;
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
                "idInventarioDTO='" + idInventarioDTO + '\'' +
                ", listaProductosDTO=" + listaProductosDTO +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventarioDTO that = (InventarioDTO) o;
        return Objects.equals(idInventarioDTO, that.idInventarioDTO) && Objects.equals(listaProductosDTO, that.listaProductosDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInventarioDTO, listaProductosDTO);
    }

}
