package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //--------------------como yo le entendi 
        System.out.println("Leer 5 elementos numericos que se introduciran ordenados de forma creciente. ");
        System.out.println("Estos los guardaremos en una tabla de tamaño 10. Leer un numero N e insertarlo en el lugar");
        System.out.println("adecuado para que la tabla cotinue ordenada ");

        int ar[] = new int[10];
        int n, posicion = 0, aux = 0;
        int orden=0;
        
        
        //----------------------------------------------- esta parte esta mal XD
        while (orden !=4) {
            System.out.println("Introduzca 5 numeros enteros en orden");
            orden = 0;
            for (int i = 0; i < 5; i++) {
                ar[i] = leer.nextInt();
                if (i>0) {
                    if (ar[i]>ar[i-1]) {
                        orden++;
                    }
                }
            }
        }//---------------------------------------------------------------------
        System.out.println("Numeros en orden");

        System.out.println("Introduzca un numero n");
        n = leer.nextInt();
        for (int i = 0; i < 6; i++) {
            if (n > ar[i] && n < ar[i + 1]) {
                posicion = i + 1;
                // aux = ar[i + 1];
                //ar[i+1] = n;

            }
        }
        System.out.println("posicion " + posicion);
        for (int i = posicion; i < 6; i++) {
            aux = ar[i];
            ar[i] = n;
            n = aux;
        }
        System.out.println("Arreglo");
        for (int i = 0; i < 6; i++) {
            System.out.print("-" + ar[i] + "-");
        }

    }

}
