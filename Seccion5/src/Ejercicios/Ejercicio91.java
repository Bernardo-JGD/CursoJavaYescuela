
package Ejercicios;

import java.util.Scanner;
public class Ejercicio91 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Crear un programa que lea por teclado una tabla de 10 numeros enteros y la desplace una posicion");
        System.out.println("hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y asi sucesivamente");
        System.out.println("El ultimo pasa a ser el primero");
        
        int ar[] = new int[10];
        int ultimo = 0;
        
        System.out.println("Ingrese 10 numeros enteros");
        for (int i = 0; i < 10; i++) {
            ar[i] = leer.nextInt();
        }
        
        ultimo = ar[ar.length-1];// guardar el ultimo elemento del arreglo 
        
        for (int i = 8; i >=0; i--) {
            ar[i+1] = ar[i]; 
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("-" + ar[i] + "-");
        }
        
        
        
    }
    
}
