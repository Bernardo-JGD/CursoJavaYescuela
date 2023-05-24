
package Ejercicios;

import java.util.Scanner;
public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        //-----------------hecho en el video
        
        
        System.out.println("Crear un programa que lea por teclado una tabla de 10 numeros");
        System.out.println("enteros y desplace N posiciones en el arreglo");
        System.out.println("(N es digitado por el usuario )");
        
        int ar[] = new int[10];
        int N, ultimo = 0;
        System.out.println("Introduzca 10 numeros enteros");
        for (int i = 0; i < 10; i++) {
            ar[i] = leer.nextInt();
        }
        System.out.println("Ingrese el numero de desplazamiento");
        N = leer.nextInt();
        
        for (int i = 1; i <=N; i++) {
            ultimo = ar[ar.length-1];//guardamos el ultimo elemento del arreglo
            for (int j = 8; j >=0; j--) {
                ar[j+1] = ar[j];
            }
            ar[0] = ultimo;
            
            System.out.println("Arreglo en la vuelta " + i);
            
            for (int j = 0; j < 10; j++) {
                System.out.print("-" + ar[j] + "-");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print("-" + ar[i] + "-");
        }
        
    }
    
}
