/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bulbtic
 */
public class Promedio {
    private List<Double> notas;
    
    private boolean validarNota(double nota){
        return nota < 0 || nota > 10;
    }
    
    public void agregarNota(double nota){
        if(notas ==  null){
            notas = new ArrayList<>();
        }
        notas.add(nota);
    }
    
    public double calculaPromedio(){
        double promedio;
        double sumatoria= 0;
        for(double nota : notas){
            sumatoria += nota;
        }
        promedio = sumatoria /notas.size();
        return promedio;
    }
}
