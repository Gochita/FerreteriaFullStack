package com.example.Ferreteria.model.DTO;

import lombok.Data;

import java.util.Objects;
import java.util.UUID;


@Data
public class ProductoDTO {
    private String idProductoDto = UUID.randomUUID().toString().substring(0, 10);
    private String nombreProductoDTO;
    private double precioProductoDTO;
    private String idProveedorDTO;

    public ProductoDTO(String idProductoDto, String nombreProductoDTO, double precioProductoDTO, String idProveedorDTO) {
        this.idProductoDto = idProductoDto;
        this.nombreProductoDTO = nombreProductoDTO;

        this.precioProductoDTO = precioProductoDTO;
        this.idProveedorDTO = idProveedorDTO;
    }

    public ProductoDTO() {

    }

    public String getIdProductoDto() {
        return idProductoDto;
    }

    public void setIdProductoDto(String idProductoDto) {
        this.idProductoDto = idProductoDto;
    }

    public String getNombreProductoDTO() {
        return nombreProductoDTO;
    }

    public void setNombreProductoDTO(String nombreProductoDTO) {
        this.nombreProductoDTO = nombreProductoDTO;
    }

    public double getPrecioProductoDTO() {
        return precioProductoDTO;
    }

    public void setPrecioProductoDTO(double precioProductoDTO) {
        this.precioProductoDTO = precioProductoDTO;
    }

    public String getIdProveedorDTO() {
        return idProveedorDTO;
    }

    public void setIdProveedorDTO(String idProveedorDTO) {
        this.idProveedorDTO = idProveedorDTO;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "idProductoDto='" + idProductoDto + '\'' +
                ", nombreProductoDTO='" + nombreProductoDTO + '\'' +
                ", precioProductoDTO=" + precioProductoDTO +
                ", idProveedorDTO='" + idProveedorDTO + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoDTO that = (ProductoDTO) o;
        return Double.compare(that.precioProductoDTO, precioProductoDTO) == 0 && Objects.equals(idProductoDto, that.idProductoDto) && Objects.equals(nombreProductoDTO, that.nombreProductoDTO)&& Objects.equals(idProveedorDTO, that.idProveedorDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProductoDto, nombreProductoDTO, precioProductoDTO, idProveedorDTO);
    }
}
