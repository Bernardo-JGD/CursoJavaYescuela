
package Ejercicios;

import java.util.Scanner;
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        System.out.println("Crear y cargar una matriz de 3x3, transponerla y mostrarla");
        
        Scanner leer = new Scanner (System.in);
        int filas, columnas, aux;
        System.out.println("Ingrese la cantidad de filas");
        filas = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        columnas = leer.nextInt();
        
        int matriz_o[][] = new int[filas][columnas];
        int matriz_o_copia[][] = new int[filas][columnas];
        System.out.println("Ingrese los elementos de la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz_o[i][j] = leer.nextInt();
                matriz_o_copia[i][j] = matriz_o[i][j];
            }
        }
        
        //primer forma------crear otra matriz
        //segunda forma------cambiar las posciones entre la matriz siempre que sea cuadrada
        
        //----primer forma
        int matriz_t1[][] = new int [columnas][filas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz_t1 [i][j] = matriz_o[j][i];
            }
            
        }
        System.out.println("Forma 1");
        System.out.println("Matriz original");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz_o[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Forma 1");
        System.out.println("La mtriz transpuesta es la sigueinte ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz_t1[i][j] + "]");
            }
            System.out.println("");
        }
        
        //segunda forma
        System.out.println("Forma 2");
        System.out.println("La mtriz transpuesta es la sigueinte ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = matriz_o_copia[j][i];
                matriz_o_copia[j][i] = matriz_o_copia[i][j];
                matriz_o_copia[i][j] = aux;
                System.out.print("[" + matriz_o_copia[i][j] + "]");
             }
            System.out.println("");
        }
        //aqui faltaba una condicion
        //j<i 
        //porque si no, la matriz quedaba igual
        
        
        
        
        
        
    }
    
}
