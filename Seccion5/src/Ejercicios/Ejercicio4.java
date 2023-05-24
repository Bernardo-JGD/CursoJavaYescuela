package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Leer 10 numeros enteros y guardarlos en un arreglo.");
        System.out.println("Debemos mostrarlos en el siguiente orden: ");
        System.out.println("El primero, el ultimo, el segundo, el penultimo, el tercero, el antepenultimo");
        
        System.out.println("Ingrese 10 numeros");
        
        double ar[] = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + (i + 1));
            ar[i] = leer.nextDouble();
        }
        System.out.println("Los elementos del arreglo en el orden indicado");
        for (int i = 0; i < 10; i++) {
            
            System.out.println(ar[i]);
            System.out.println(ar[9-i]);
            System.out.println("---------");
            
        }
        
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 5; i++) {
            
            System.out.println(ar[i]);
            System.out.println(ar[9-i]);
            System.out.println("---------");
            
        }
        
    }
    
}
