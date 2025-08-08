/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Alumno;

/**
 *
 * @author Ian
 */
public class Metodos {

    public static double calcularFilaPromedio(Alumno[][] alumnos, int fila, int columnas) {

        double suma = 0;
        for (int j = 0; j < columnas; j++) {
            suma += alumnos[fila][j].getPromedio();
        }
        return suma / columnas;
    }

    public static double calcularEdad(Alumno[][] alumnos, int filas, int columnas) {
        double suma = 0;
        int totalEdades = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += alumnos[i][j].getEdad();
                totalEdades++;
            }
        }
        return suma / totalEdades;
    }

    public static int calcularFilaDestacada(Alumno[][] posicion) {

        double promedio = 0;
        int filaDestacada = 1;

        for (int i = 0; i < posicion.length; i++) {

            double promedioFila = calcularFilaPromedio(posicion, i, posicion[i].length);

            if (promedioFila > promedio) {
                promedio = promedioFila;
                filaDestacada = i;
            }
        }
        return filaDestacada;
    }

    public static Alumno mostrarAlumnoMasDestacado(Alumno[][] alumnos) {
        Alumno alumDestacado = alumnos[0][0];

        for (Alumno[] fila : alumnos) {
            for (Alumno a : fila) {
                if (a.getPromedio() > alumDestacado.getPromedio()) {
                    alumDestacado = a;
                }
            }
        }
        return alumDestacado;
    }
}
