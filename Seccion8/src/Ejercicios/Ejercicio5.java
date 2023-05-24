
package Ejercicios;

import java.util.Scanner;
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        //--------------------------------------------------ESTE ES EL DEL VIDEO
        System.out.println("Crear y cargar una matriz de tamaño nxm mostrar y mostrar la suma de cada fila y cada columna");
        
        int filas, columnas , suma_o=0, suma_v=0;
        System.out.println("ingrese cantidad filas");
        filas = leer.nextInt();
        System.out.println("Ingrese cantidad columnas");
        columnas = leer.nextInt();
        int matriz[][] = new int[filas][columnas];
        
        int arreglo_filas[] = new int[filas];
        int arreglo_columnas[] = new int[columnas];
        
        System.out.println("Ingrese los elementos de la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
                //suma_o = suma_o + matriz[i][j];
                
               // arreglo_filas[i] = suma_o + matriz[i][j];
               // arreglo_columnas[j] = suma_v +matriz[i][j];
            }
        }
        System.out.println("La matriz es");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < filas; i++) {
            suma_o = 0 ;
            for (int j = 0; j < columnas; j++) {
                suma_o = suma_o + matriz[i][j];
            }
            arreglo_filas[i] = suma_o;
        }
        for (int j = 0; j < columnas; j++) {
            suma_v = 0 ;
            for (int i = 0; i < filas; i++) {
                suma_v = suma_v + matriz[i][j];
            }
            arreglo_columnas[j] = suma_v;
        }
        System.out.println("La suma de las filas es");
        for (int i = 0; i < filas; i++) {
            System.out.print("[" + arreglo_filas[i] + "]");   
        }
        System.out.println("");
        System.out.println("La suma de las columnas");
        for (int i = 0; i < columnas; i++) {
            System.out.print("[" + arreglo_columnas[i] + "]");   
        }
        
        
        
        
    }
    
}
