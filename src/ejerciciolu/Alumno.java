/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolu;

import java.time.LocalDate;

/**
 *
 * @author Bulbtic
 */
public class Alumno {
    
    private Long lu;
    private String apellido;
    private String nombres;
    private String dni;
    private int cantidadMateria;
    private LocalDate fechaIngreso;
    private double promedio;

    public Long getLu() {
        return lu;
    }

    public void setLu(Long lu) {
        this.lu = lu;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCantidadMateria() {
        return cantidadMateria;
    }

    public void setCantidadMateria(int cantidadMateria) {
        this.cantidadMateria = cantidadMateria;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "lu=" + lu + 
                ", apellido=" + apellido + 
                ", nombres=" + nombres + 
                ", dni=" + dni + 
                ", cantidadMateria=" + cantidadMateria + 
                ", fechaIngreso=" + fechaIngreso + 
                ", promedio=" + promedio + '}';
    }
    
    
    
}
