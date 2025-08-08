/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dieme
 */
public class Alumno {
    private String nombre;
    private int edad;
    private String carrera;
    private int cuatrimestre;
    private double promedio;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Alumno() {
    }

    public Alumno(String nombre, int edad, String carrera, int cuatrimestre, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.cuatrimestre = cuatrimestre;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", cuatrimestre=" + cuatrimestre + ", promedio=" + promedio + '}';
    }
    
    
}


