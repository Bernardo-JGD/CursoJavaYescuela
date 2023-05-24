package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        //------------------------------ ESTE LO HICE YO

        System.out.println("Leer 10 numeros enteros en una tabla.");
        System.out.println("Guardar en otra tabla los elementos pares de la primera");
        System.out.println("y a continuacion los elementos impares");

        int arreglo[] = new int[10];
        int pares[] = new int[10];
        int impares[] = new int[10];
        int incremento_par = 0, incremento_impar = 0;

        System.out.println("Ingrese 10 numeros enteros");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = leer.nextInt();
            if (arreglo[i] % 2 == 0) {
                pares[incremento_par] = arreglo[i];
                incremento_par++;
            } else {
                impares[incremento_impar] = arreglo[i];
                incremento_impar++;
            }
        }
        System.out.println("Arrelo original");
        for (int i = 0; i < 10; i++) {
            System.out.print("-" + arreglo[i] + "-");
        }
        System.out.println("");
        System.out.println("Arreglo par");
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] != 0) {
                System.out.print("-" + pares[i] + "-");
            }
        }
        System.out.println("");
        System.out.println("Arreglo impar");
        for (int i = 0; i < impares.length; i++) {
            if (impares[i] != 0) {
                System.out.print("-" + impares[i] + "-");
            }
        }
    }
}
