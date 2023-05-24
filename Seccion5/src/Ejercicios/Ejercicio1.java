
package Ejercicios;

import java.util.Scanner;
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido");
        
        System.out.println("Ingrese 5 numeros");
        int ar[] = new int [5];
        for (int i = 0; i < 5; i++) {
            ar[i] = leer.nextInt();
        }
        System.out.println("Los numeros ingresador en orden son : " );
        for (int i : ar){
            System.out.println(" --- "  + i + " --- ");
        }
        
        
    }
    
}
