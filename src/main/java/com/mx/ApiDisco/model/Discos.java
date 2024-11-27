package com.mx.ApiDisco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DISCOS")
public class Discos {

    @Id
    @Column(name = "ID", nullable = false)
    private Integer idD;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "GENERO", nullable = false)
    private String genero;

    @Column(name = "PRECIO", nullable = false)
    private Float precio;

    // Constructores
    public Discos() {}

    public Discos(Integer idD, String nombre, String genero, Float precio) {
        this.idD = idD;
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
    }

    // Getters y Setters
    public Integer getIdD() {
        return idD;
    }

    public void setIdD(Integer idD) {
        this.idD = idD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Discos [idD=" + idD + ", nombre=" + nombre + ", genero=" + genero + ", precio=" + precio + "]";
    }
}
