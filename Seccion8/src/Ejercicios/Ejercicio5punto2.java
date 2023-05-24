
package Ejercicios;

import java.util.Scanner;
public class Ejercicio5punto2 {
    //-----------------------------------------------pense en sumar las filas y columnas desde el momento que la leo
    //-----------------------------------------------pero me acabo de dar cuenta que no puedo hacerlo como lo hice en el
    //-----------------------------------------------5.1 porque al leer de manera transpuesta
    //-----------------------------------------------todavia no hay valores en las posiciones j i y leeria 0 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        //--------------------------------------------------ESTE LO HICE YO pero mejorando el anterior que hice
        //--------------------------------------------------QUE SIEMPRE NO LO PUDE MEJORAR
        System.out.println("Crear y cargar una matriz de tamaño nxm mostrar y mostrar la suma de cada fila y cada columna");
        int filas, columnas, suma_f = 0, suma_c = 0;
        System.out.println("Ingrese la cantidad de filas");
        filas = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        columnas = leer.nextInt();
        
        int matriz[][] = new int[filas][columnas];
        int arreglo_f[] = new int[filas];
        int arreglo_c[] = new int[columnas];
        
        System.out.println("Ingrese los elementos de la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        
    }
    
}
