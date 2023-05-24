
package Ejercicios;

import java.util.Scanner;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma");
        
        int matriz1[][], matriz2[][], matriz3[][], filas, columnas;
        
        System.out.println("Ingrese el tamaño de las filas ");
        filas = leer.nextInt();
        System.out.println("ingrese el tamaño de las columnas");
        columnas = leer.nextInt();
        matriz1 = new int[filas][columnas];
        matriz2 = new int[filas][columnas];
        matriz3 = new int[filas][columnas];
        
        System.out.println("Ingrese los elementos de la matriz 1");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = leer.nextInt();
            }
        }
        System.out.println("Ingrese los elementos de la matriz 2");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = leer.nextInt();
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("La suma de las dos matrices es");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz3[i][j] + "]");
            }
            System.out.println("");
        }
        
        
        
        
    }
    
}
