package com.example.tp4.modelos;

public class Probabilidad
{
    private int dia;
    private double probabilidad;
    private double probabilidadAcumulada;

    public Probabilidad(int dia, double probabilidad, double probabilidadAcumulada) {
        this.dia = dia;
        this.probabilidad = probabilidad;
        this.probabilidadAcumulada = probabilidadAcumulada;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public double getProbabilidadAcumulada() {
        return probabilidadAcumulada;
    }

    public void setProbabilidadAcumulada(double probabilidadAcumulada) {
        this.probabilidadAcumulada = probabilidadAcumulada;
    }
}
