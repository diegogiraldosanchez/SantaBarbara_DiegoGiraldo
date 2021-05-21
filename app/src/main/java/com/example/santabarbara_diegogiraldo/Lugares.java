package com.example.santabarbara_diegogiraldo;

import java.io.Serializable;

public class Lugares implements Serializable {

    String nombreLugar, descripcion;
    int fotoLugar;

    public Lugares(String nombreLugar, String descripcion, int fotoLugar) {
        this.nombreLugar = nombreLugar;
        this.descripcion = descripcion;
        this.fotoLugar = fotoLugar;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFotoLugar() {
        return fotoLugar;
    }

    public void setFotoLugar(int fotoLugar) {
        this.fotoLugar = fotoLugar;
    }
}
