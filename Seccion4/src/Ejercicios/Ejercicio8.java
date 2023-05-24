package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Pedir un numero N y mostrar todos los numeros del 1 al N");

        int N, incremento = 0;
        System.out.println("Ingrese un numero entero");
        N = leer.nextInt();

        do {
            
            incremento++;
            System.out.println(incremento);

        } while (incremento < N);
        
        for (int i = 1; i <=N; i++) {
            System.out.println(i);
        }

    }

}
