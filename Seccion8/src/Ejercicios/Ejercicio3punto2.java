package Ejercicios;

import java.util.Scanner;

public class Ejercicio3punto2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int filas, columnas;
        System.out.println("Ingrese la logitud de las filas");
        filas = leer.nextInt();
        System.out.println("Ingrese la longitud de las columnas");
        columnas = leer.nextInt();
        int matriz[][] = new int[filas][columnas];
        int transpuesta[][] = new int[columnas][filas];

        System.out.println("Ingrese los elementos de la matriz de " + filas + "x" + columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("La matriz original es");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                transpuesta[j][i] = matriz[i][j];

            }
        }
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print("[" + transpuesta[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
