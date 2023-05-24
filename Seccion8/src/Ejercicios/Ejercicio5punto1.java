package Ejercicios;

import java.util.Scanner;

public class Ejercicio5punto1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        //--------------------------------------------------ESTE LO HICE YO
        System.out.println("Crear y cargar una matriz de tamaño nxm mostrar y mostrar la suma de cada fila y cada columna");

        int filas, columnas, suma_f = 0, suma_c = 0;

        System.out.println("Ingrese la cantidad de filas");
        filas = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        columnas = leer.nextInt();
        
        int matriz[][] = new int [filas][columnas];
        int arreglo_f[] = new int[filas];
        int arreglo_c[] = new int[columnas];
        System.out.println("Ingrese los elementos de la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("La matriz es la siguiente");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        //suma de las filas y columnas
        for (int i = 0; i < filas; i++) {
            suma_f = 0;
            suma_c = 0;
            for (int j = 0; j < columnas; j++) {
                suma_f = suma_f + matriz[i][j];
                suma_c = suma_c + matriz[j][i];
            }
            arreglo_f[i] = suma_f;
            arreglo_c[i] = suma_c;
        }
        System.out.println("La suma de cada fila es");
        for (int i = 0; i < filas; i++) {
            System.out.print("[" + arreglo_f[i] + "]");
        }
        System.out.println("");
        System.out.println("La suma de cada columnas es");
        for (int i = 0; i < columnas; i++) {
            System.out.print("[" + arreglo_c[i] + "]");
        }
    }

}
