package com.example.Ferreteria.model;

import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document(collection = "Inventario")
public class ProductoModel {


    @Id
    private String idProducto = UUID.randomUUID().toString().substring(0, 10);
    @NonNull private String nombreProducto;
    @NonNull private Double precioProducto;
    @NonNull private String idProveedor;
    @NonNull private Integer stock;

    public ProductoModel() {
    }

    public ProductoModel(@NonNull String nombreProducto, @NonNull Double precioProducto, @NonNull String idProveedor, @NonNull Integer stock) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.idProveedor = idProveedor;
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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

    public void setPrecioProducto(Double precioProducto) {
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
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoModel that = (ProductoModel) o;
        return Objects.equals(idProducto, that.idProducto) && nombreProducto.equals(that.nombreProducto) && precioProducto.equals(that.precioProducto) && idProveedor.equals(that.idProveedor) && stock.equals(that.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, nombreProducto, precioProducto, idProveedor, stock);
    }
}
