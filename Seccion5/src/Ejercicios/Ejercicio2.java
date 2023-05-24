
package Ejercicios;

import java.util.Scanner;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Leer 5 numeros, guardarlos en un arreglo, y mostrarlos en el orden inverso al introducido");
        
        int ar[] = new int [5];
        System.out.println("Ingrese 5 numeros");
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero " + (i+1));
            ar[i] = leer.nextInt();
        }
        for (int i = 4; i>=0; i--) {
            System.out.println(ar[i]);
        }
        
    }
    
}
