
package Busquedas;

import java.util.Scanner;

public class Busqueda_Secuencial_1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        //------------------------ESTE ES EL MIO
        
        System.out.println("Ingrese el tamaño del arreglo");
        int n = leer.nextInt();
        int arreglo[] = new int [n];
        int aux, elemento;
        System.out.println("Ingrese los elementos del arreglo");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = leer.nextInt();
        }
        System.out.println("Ordenando el arreglo");
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arreglo[j]>arreglo[j+1]) {
                    aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        System.out.println("Ingrese el elemento que desea buscar");
        elemento = leer.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicion---- " + i);
            if (arreglo[i] == elemento) {
                System.out.println("Posicion---- " + i);
                System.out.println("Elemento " + "[" + elemento + "]" + " encontrado");
                break;
            }
        }
    }
    
}
