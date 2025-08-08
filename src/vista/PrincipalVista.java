/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Alumno;
import controlador.Metodos;
import static controlador.Metodos.calcularEdad;
import static controlador.Metodos.calcularFilaDestacada;
import static controlador.Metodos.calcularFilaPromedio;
import static controlador.Metodos.mostrarAlumnoMasDestacado;

/**
 *
 * @author Dieme
 */
public class PrincipalVista {

    public static void main(String[] args) {
        // TODO code application logic here
        registrarAlumnos();
    }

    public static void registrarAlumnos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int columnas = sc.nextInt();
        sc.nextLine();

        Alumno[][] posicion = new Alumno[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("\nAlumno en posicion [" + i + "][" + j + "]");

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                System.out.print("Carrera: ");
                String carrera = sc.nextLine();

                System.out.print("Cuatrimestre: ");
                int cuatrimestre = sc.nextInt();

                System.out.print("Promedio: ");
                double promedio = sc.nextDouble();
                sc.nextLine();

                posicion[i][j] = new Alumno(nombre, edad, carrera, cuatrimestre, promedio);

            }
        }

        System.out.println("\n=== Lista de Alumnos ===");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + i + "][" + j + "] -> ");
                posicion[i][j].mostrarInfo();
            }
            
            double promedioFila = calcularFilaPromedio(posicion, i, columnas);
            System.out.println("Promedio de calificaciones en fila " + i + ": " + promedioFila);
        }
        double promedioGrupo = calcularEdad(posicion, filas, columnas);
        System.out.println("El promedio de edades del grupo: " + promedioGrupo);
        
        int filaDestacada = calcularFilaDestacada(posicion);
        System.out.println("La fila destacada es:" + filaDestacada);
        
        Alumno alumnoDestacado = mostrarAlumnoMasDestacado(posicion);
        System.out.println("El alumno destacado: " + alumnoDestacado);
        
    }

}
