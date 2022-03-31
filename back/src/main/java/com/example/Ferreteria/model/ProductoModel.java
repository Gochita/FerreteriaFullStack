package com.example.Ferreteria.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document(collection = "Producto")
public class ProductoModel {


    @Id
    private String idProducto = UUID.randomUUID().toString().substring(0, 10);

    private String nombreProducto;
    private double precioProducto;
    private String idProveedor;

    public ProductoModel() {
    }

    public ProductoModel(String idProducto, String nombreProducto, double precioProducto, String idProveedor) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;

        this.precioProducto = precioProducto;
        this.idProveedor = idProveedor;
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
        return "ProductoModel{" +
                "idProducto='" + idProducto + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +

                ", precioProducto=" + precioProducto +
                ", idProveedor='" + idProveedor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoModel that = (ProductoModel) o;
        return Double.compare(that.precioProducto, precioProducto) == 0 && Objects.equals(idProducto, that.idProducto) && Objects.equals(nombreProducto, that.nombreProducto)  && Objects.equals(idProveedor, that.idProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, nombreProducto,  precioProducto, idProveedor);
    }
}
