
package Ejercicios;

import java.util.Scanner;
public class Ejercicio2punto1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma");
        
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int suma[][] = new int[3][3];
        
        System.out.println("Ingrese los elementos de la matriz 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = leer.nextInt();
            }
        }
        System.out.println("Ingrese los elementos de la matriz 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = leer.nextInt();
            }
        } 
        //vamos a sumar la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma [i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("La suma de las dos matrices");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + suma[i][j] + "]");
            }
            System.out.println("");
        }
        
    }
    
}
