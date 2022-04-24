package com.example.tp4.controladores;

import com.example.tp4.modelos.Linea;
import com.example.tp4.modelos.Probabilidad;
import com.example.tp4.pantallas.PantallaMantenimieto;

import java.util.ArrayList;

public class GestorMantenimientoCorrectivo extends GestorMantenimiento
{
    private ArrayList<Linea> lineas;
    private ArrayList<Linea> ultimasLineas;

    public GestorMantenimientoCorrectivo(int n, int a, int b, int costoArreglo, int costoMantenimiento, PantallaMantenimieto pantallaMantenimieto) {
        super(costoArreglo,costoMantenimiento);
        this.simularMantenimientoCorrectivo(n,a,b);
        pantallaMantenimieto.graficar(this.lineas);
        pantallaMantenimieto.graficarVector(this.ultimasLineas);
    }


    public int obtenerDiaRotura(double RND){
        ArrayList<Probabilidad> probabilidades = super.getProbabilidades();
        for (Probabilidad probabilidad: probabilidades)
        {
           if(RND < probabilidad.getProbabilidadAcumulada()) return probabilidad.getDia();
        }
        return -1;
    }
    public void simularMantenimientoCorrectivo(int n,int a,int b){
        this.lineas = new ArrayList<>();
        this.ultimasLineas = new ArrayList<>();
        Linea lineaAnterior = null;
        for (var i = 0; i<n;i++){
            Linea linea = new Linea();
            linea.setI(i);
            if(lineaAnterior != null ){
                linea.setLineaAnterior(lineaAnterior);
            }

            if(linea.getLineaAnterior() != null)
            {
                // iteración > 0

                // nuevo ciclo
                if(linea.getLineaAnterior().esDiaRotura())
                {
                    linea.setDia(1);
                    linea.setDiaRotura(linea.getLineaAnterior().getDiaRotura());

                    linea.setCostoDia(0);


                }
                // continua ciclo anterior
                else
                {
                    linea.setDia(linea.getLineaAnterior().getDia() + 1 );
                    linea.setDiaRotura(linea.getLineaAnterior().getDiaRotura());

                    if(linea.esDiaRotura())
                    {
                        linea.setRNDDiaRotura(Math.random());
                        linea.setDiaRotura(obtenerDiaRotura(linea.getRNDDiaRotura()));
                        linea.setCostoDia(super.getCostoArreglo());
                    }else{
                        linea.setCostoDia(0);

                    }

                }

                // sumar costo acumulado en ambos casos
                linea.setCostoAcumulado(linea.getCostoDia() + linea.getLineaAnterior().getCostoAcumulado());
            }
            else
            {
                // iteración 0
                linea.setDia(0);
                linea.setRNDDiaRotura(Math.random());
                linea.setDiaRotura(obtenerDiaRotura(linea.getRNDDiaRotura()));



            }
            // preguntar si la iteración esta entre el desde y hasta ingresado por el usuario para guardar
            if(i >= a && i <= b)
            {
                    this.lineas.add(linea);
            }
            if(i == n - 1 || i == n - 2){
                    this.ultimasLineas.add(linea);
            }

            lineaAnterior = linea;

        }
    }


}
