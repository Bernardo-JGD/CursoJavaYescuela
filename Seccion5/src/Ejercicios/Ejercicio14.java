package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Leer dos series de 10 enteros que estaran ordenados crecientemente. Copiar (fusionar) las dos");
        System.out.println("tablas en una tercera de foma que sigan ordenados");

        int arreglo1[] = new int[10];
        int arreglo2[] = new int[10];
        int arreglo3[];
        boolean orden;

        do {
            System.out.println("Ingrese 10 numeros enteros ordenados para el primer arreglo");
            orden = true;
            for (int i = 0; i < 10; i++) {
                arreglo1[i] = leer.nextInt();
                if (i > 0) {
                    if ((arreglo1[i] < arreglo1[i - 1]) && orden == true) {
                        orden = false;
                    }
                }
            }
        } while (orden == false);
        System.out.println("El primer arreglo esta en orden");

        do {
            System.out.println("Ingrese 10 numeros ordenados para el siguiente arreglo");
            orden = true;
            for (int i = 0; i < 10; i++) {
                arreglo2[i] = leer.nextInt();
                if (i > 0) {
                    if ((arreglo2[i] < arreglo2[i - 1]) && orden == true) {
                        orden = false;
                    }
                }
            }
        } while (orden == false);
        System.out.println("El primer arreglo esta en orden");
        arreglo3 = new int [20];
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (arreglo1[i]<arreglo2[i]) {
                arreglo3[j] = arreglo1[i];
                arreglo3[j+1] = arreglo2[i];
                j+=2;
            }else{
                arreglo3[j] = arreglo2[i];
                arreglo3[j+1] = arreglo1[i];
                j+=2;
            }
        }
        System.out.println("El tercer arreglo es");
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.print("-" + arreglo3[i] + "-");
        }
    }
    /*
1
3
5
7
9
11
13
15
17
19
    
2
4
6
8
10
12
14
16
18
20
    
    
        
    
    */

}
