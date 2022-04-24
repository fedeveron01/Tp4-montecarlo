package com.example.tp4.controladores;

import com.example.tp4.modelos.Probabilidad;

import java.util.ArrayList;

public abstract class GestorMantenimiento {


    private int costoRevision;
    private int costoArreglo;
    private int diaRevision;

    public int getDiaRevision() {
        return diaRevision;
    }

    public void setDiaRevision(int diaRevision) {
        this.diaRevision = diaRevision;
    }

    public void setProbabilidades(ArrayList<Probabilidad> probabilidades) {
        this.probabilidades = probabilidades;
    }

    public ArrayList<Probabilidad> getProbabilidades() {
        return probabilidades;
    }

    private ArrayList<Probabilidad> probabilidades;

    public GestorMantenimiento() {
        this.costoRevision = 900;
        this.costoArreglo = 2500;
        this.armarTablaProbabilidades();

    }

    public GestorMantenimiento(int costoArreglo, int costoRevision) {
        if(costoArreglo >= 0 && costoArreglo <= 99999999){
            this.costoArreglo = costoArreglo;
        }else{
            this.costoArreglo = 2500;
        }
        if(costoRevision >= 0 && costoRevision <= 99999999){
            this.costoRevision = costoRevision;
        }else{
            this.costoRevision = 900;
        }
        this.armarTablaProbabilidades();

    }

    public void armarTablaProbabilidades()
    {
        this.probabilidades = new ArrayList<>();
        Probabilidad probabilidad1 = new Probabilidad(5,0.25,.25);
        Probabilidad probabilidad2 = new Probabilidad(6,.45,.7);
        Probabilidad probabilidad3 = new Probabilidad(7,.2,.9);
        Probabilidad probabilidad4 = new Probabilidad(8,.1,1);
        this.probabilidades.add(probabilidad1);
        this.probabilidades.add(probabilidad2);
        this.probabilidades.add(probabilidad3);
        this.probabilidades.add(probabilidad4);



    }
    public int getCostoRevision() {
        return costoRevision;
    }

    public void setCostoRevision(int costoRevision) {
        this.costoRevision = costoRevision;
    }

    public int getCostoArreglo() {
        return costoArreglo;
    }

    public void setCostoArreglo(int costoArreglo) {
        this.costoArreglo = costoArreglo;
    }
}
