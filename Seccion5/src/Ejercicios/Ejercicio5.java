package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Este lo hice solito :D");
        Scanner leer = new Scanner(System.in);

        System.out.println("Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercer a de la forma");
        System.out.println("1A 1B, 2A 2B , 3A 3B");

        int ar1[] = new int[10];
        int ar2[] = new int[10];
        int ar3[] = new int[20];

        System.out.println("Llene el arreglo 1");
        for (int i = 0; i < 10; i++) {
            ar1[i] = leer.nextInt();
            ar3[i * 2] = ar1[i];
        }
        System.out.println("Llene el arreglo 2");

        for (int i = 0; i < 10; i++) {
            ar2[i] = leer.nextInt();

            if (i == 0) {
                ar3[i + 1] = ar2[i];
                //System.out.println(i+1);
            } else {
                ar3[(i * 2) + 1] = ar2[i];
                // System.out.println((i*2)+1);
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(ar3[i]);
        }
    }

}
