package com.inventariodos.entrada.EntradaEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "entrada")
public class EntradaEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String objeto;
    @Column
    private String color;
    @Column
    private String talla;
    @Column
    private Integer cantidad;
    @Column
    private String nombreentrada;
    @Column
    private String nombresalida;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getObjeto() {
        return objeto;
    }
    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getNombreentrada() {
        return nombreentrada;
    }
    public void setNombreentrada(String nombreentrada) {
        this.nombreentrada = nombreentrada;
    }
    public String getNombresalida() {
        return nombresalida;
    }
    public void setNombresalida(String nombresalida) {
        this.nombresalida = nombresalida;
    }



}
