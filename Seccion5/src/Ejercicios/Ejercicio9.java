package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        // --------ESTE LO HICE YO

        System.out.println("Crear un programa que lea por teclado una tabla de 10 numeros enteros y la desplace una posicion");
        System.out.println("hacia abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y asi sucesivamente");
        System.out.println("El ultimo pasa a ser el primero");

        Scanner leer = new Scanner(System.in);
        int ar[] = new int[10];
        int aux = 0, aux2 = 0;

        System.out.println("Ingrese 10 numeros enteros");
        for (int i = 0; i < 10; i++) {
            ar[i] = leer.nextInt();
        }
        
        for (int i = 0; i < ar.length-1; i++) {
            if (i == 0) {
                aux = ar[i];
            }
            
            ar[i] = ar[i + 1];
            if (i+1 == ar.length-1) {
                ar[i+1] = aux;
            }

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ar[i]);
        }
    }

}
