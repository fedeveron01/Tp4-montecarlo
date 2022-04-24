package com.example.tp4.modelos;

public class Linea
{
    private int i;
    private int dia;
    private int diaRotura;
    private double costoDia;
    private double costoAcumulado;
    private double RNDDiaRotura;
    private Linea lineaAnterior;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean esDiaRotura(){
        if(lineaAnterior!=null){
            return (getDia() == lineaAnterior.getDiaRotura());
        }else{
            return false;
        }

    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getRNDDiaRotura() {
        return RNDDiaRotura;
    }

    public void setRNDDiaRotura(double RNDDiaRotura) {
        this.RNDDiaRotura = RNDDiaRotura;
    }

    public int getDiaRotura() {
        return diaRotura;
    }

    public void setDiaRotura(int diaRotura) {
        this.diaRotura = diaRotura;
    }

    public double getCostoDia() {
        return costoDia;
    }

    public void setCostoDia(double costoDia) {
        this.costoDia = costoDia;
    }

    public double getCostoAcumulado() {
        return costoAcumulado;
    }

    public void setCostoAcumulado(double costoAcumulado) {
        this.costoAcumulado = costoAcumulado;
    }

    public Linea getLineaAnterior() {
        return lineaAnterior;
    }

    public void setLineaAnterior(Linea lineaAnterior) {
        this.lineaAnterior = lineaAnterior;
    }



}
