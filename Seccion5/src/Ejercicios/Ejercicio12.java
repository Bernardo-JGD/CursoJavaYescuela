package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Leer por teclado una tabla de 10 elementos numericos enteros y una posicion entre");
        System.out.println("0 y 9. Eliminar el elemento situado en la posicion dada sin dejar huecos");

        int ar[] = new int[10];
        int posicion = 0;
        for (int i = 0; i < 10; i++) {
            ar[i] = leer.nextInt();
        }
        do {
            
            System.out.println("Ingrese un numero entre el 0 y 9 ");
            posicion = leer.nextInt();

        } while (posicion<0 || posicion >9);

        for (int i = posicion; i < 9; i++) {

            ar[i] = ar[i + 1];
        }
        ar[9] = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("-" + ar[i] + "-");
        }
    }

}
