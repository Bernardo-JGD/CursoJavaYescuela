package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Leer 5 numeros por teclado, almacenarlos en un arreglo y realizar la media de los numeros positivos");
        System.out.println(", la media de los numeros negativos y contar el numero de ceros");

        float ar[] = new float[5];
        float cantipos = 0, cantineg = 0, canticeros = 0, sumpos = 0, sumneg = 0;
        float mediapos = 0, medianeg = 0;

        System.out.println("Ingrese 5 numeros");
        for (int i = 0; i < 5; i++) {

            ar[i] = leer.nextFloat();

            if (ar[i] > 0) {
                cantipos++;
                sumpos = sumpos + ar[i];
            }
            if (ar[i] < 0) {
                cantineg++;
                sumneg = sumneg + ar[i];
            }
            if (ar[i] == 0) {
                canticeros++;
            }

        }

        if (cantipos == 0) {
            System.out.println("No hay numeros positivos");
        } else {
            mediapos = sumpos / cantipos;
            System.out.println("Media de positivos --- " + mediapos);
        }
        if (cantineg == 0) {
            System.out.println("No hay numeros negativos");
        } else {
            medianeg = sumneg / cantineg;
            System.out.println("Media de negativos --- " + medianeg);
        }
        if (canticeros == 0) {
            System.out.println("No hay ceros");
        } else {
            System.out.println("Cantidad de 0 --- " + canticeros);
        }

    }

}
