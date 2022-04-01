package com.example.Ferreteria.model.DTO;

import lombok.Data;

import java.util.Objects;



@Data
public class ProductoDTO {
    private String idProducto;
    private String nombreProducto;
    private double precioProducto;
    private String idProveedor;

    public ProductoDTO(String nombreProducto, double precioProducto, String idProveedor) {

        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.idProveedor = idProveedor;
    }

    public ProductoDTO() {

    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "idProductoDto='" + idProducto + '\'' +
                ", nombreProductoDTO='" + nombreProducto + '\'' +
                ", precioProductoDTO=" + precioProducto +
                ", idProveedorDTO='" + idProveedor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoDTO that = (ProductoDTO) o;
        return Double.compare(that.precioProducto, precioProducto) == 0 && Objects.equals(idProducto, that.idProducto) && Objects.equals(nombreProducto, that.nombreProducto)&& Objects.equals(idProveedor, that.idProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, nombreProducto, precioProducto, idProveedor);
    }
}
