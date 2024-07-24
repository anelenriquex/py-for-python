package com.inventario.salida.SalidaEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "salida")
public class SalidaEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String objeto;

    @Column
    private String color;

    @Column
    private Integer cantidad;

    @Column
    private String talla;

    @Column
    private String paraquiennombre;

    @Column
    private String paraquienapellido;

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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getParaquiennombre() {
        return paraquiennombre;
    }

    public void setParaquiennombre(String paraquiennombre) {
        this.paraquiennombre = paraquiennombre;
    }

    public String getParaquienapellido() {
        return paraquienapellido;
    }

    public void setParaquienapellido(String paraquienapellido) {
        this.paraquienapellido = paraquienapellido;
    }


    
}
