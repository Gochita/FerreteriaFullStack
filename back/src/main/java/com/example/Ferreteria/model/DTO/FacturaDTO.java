package com.example.Ferreteria.model.DTO;


import lombok.Data;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

@Data
public class FacturaDTO {
    private Integer idFacturaDTO;
    private LocalDate fechaFacturaDTO;
    private String nombreVendedorDTO;
    private String nombreClienteDTO;
    private int totalPagar;
    private HashMap<ProductoDTO, Integer> listaProductosFacturaDTO;

    public FacturaDTO(Integer idFacturaDTO, LocalDate fechaFacturaDTO, String nombreVendedorDTO, String nombreClienteDTO, int totalPagar, HashMap<ProductoDTO, Integer> listaProductosFacturaDTO) {
        this.idFacturaDTO = idFacturaDTO;
        this.fechaFacturaDTO = fechaFacturaDTO;
        this.nombreVendedorDTO = nombreVendedorDTO;
        this.nombreClienteDTO = nombreClienteDTO;
        this.totalPagar = totalPagar;
        this.listaProductosFacturaDTO = listaProductosFacturaDTO;
    }

    public FacturaDTO() {
    }

    public Integer getIdFacturaDTO() {
        return idFacturaDTO;
    }

    public void setIdFacturaDTO(Integer idFacturaDTO) {
        this.idFacturaDTO = idFacturaDTO;
    }

    public LocalDate getFechaFacturaDTO() {
        return fechaFacturaDTO;
    }

    public void setFechaFacturaDTO(LocalDate fechaFacturaDTO) {
        this.fechaFacturaDTO = fechaFacturaDTO;
    }

    public String getNombreVendedorDTO() {
        return nombreVendedorDTO;
    }

    public void setNombreVendedorDTO(String nombreVendedorDTO) {
        this.nombreVendedorDTO = nombreVendedorDTO;
    }

    public String getNombreClienteDTO() {
        return nombreClienteDTO;
    }

    public void setNombreClienteDTO(String nombreClienteDTO) {
        this.nombreClienteDTO = nombreClienteDTO;
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }

    public HashMap<ProductoDTO, Integer> getListaProductosFacturaDTO() {
        return listaProductosFacturaDTO;
    }

    public void setListaProductosFacturaDTO(HashMap<ProductoDTO, Integer> listaProductosFacturaDTO) {
        this.listaProductosFacturaDTO = listaProductosFacturaDTO;
    }

    @Override
    public String toString() {
        return "FacturaDTO{" +
                "idFacturaDTO=" + idFacturaDTO +
                ", fechaFacturaDTO=" + fechaFacturaDTO +
                ", nombreVendedorDTO='" + nombreVendedorDTO + '\'' +
                ", nombreClienteDTO='" + nombreClienteDTO + '\'' +
                ", totalPagar=" + totalPagar +
                ", listaProductosFacturaDTO=" + listaProductosFacturaDTO +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacturaDTO that = (FacturaDTO) o;
        return totalPagar == that.totalPagar && Objects.equals(idFacturaDTO, that.idFacturaDTO) && Objects.equals(fechaFacturaDTO, that.fechaFacturaDTO) && Objects.equals(nombreVendedorDTO, that.nombreVendedorDTO) && Objects.equals(nombreClienteDTO, that.nombreClienteDTO) && Objects.equals(listaProductosFacturaDTO, that.listaProductosFacturaDTO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFacturaDTO, fechaFacturaDTO, nombreVendedorDTO, nombreClienteDTO, totalPagar, listaProductosFacturaDTO);
    }
}
