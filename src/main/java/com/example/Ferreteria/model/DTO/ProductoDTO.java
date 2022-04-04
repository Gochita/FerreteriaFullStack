package com.example.Ferreteria.model.DTO;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

import java.util.Objects;



@Data
public class ProductoDTO {
    @Id
    private String idProducto;
    @NonNull private String nombreProducto;
    @NonNull private Double precioProducto;
    @NonNull private String idProveedor;
    @NonNull private Integer stock;

    public ProductoDTO(@NonNull String nombreProducto, @NonNull Double precioProducto, @NonNull String idProveedor, @NonNull Integer stock) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.idProveedor = idProveedor;
        this.stock = stock;
    }

    public ProductoDTO() {

    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
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

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoDTO that = (ProductoDTO) o;
        return Objects.equals(idProducto, that.idProducto) && nombreProducto.equals(that.nombreProducto) && precioProducto.equals(that.precioProducto) && idProveedor.equals(that.idProveedor) && stock.equals(that.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, nombreProducto, precioProducto, idProveedor, stock);
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "idProducto='" + idProducto + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", idProveedor='" + idProveedor + '\'' +
                ", stock=" + stock +
                '}';
    }
}
