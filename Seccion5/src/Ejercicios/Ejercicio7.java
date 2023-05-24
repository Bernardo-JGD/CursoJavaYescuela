package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Leer por teclado una serie de 10 numeros enteros. La aplicacion debe indicarnos ");
        System.out.println("si los numeros estan ordenados, de forma creciente, decreciente, o si estan desordenados");

        int ar[] = new int[10];

        String orden = "";
        int banderapos = 0, banderaneg = 0, igual = 0;

        System.out.println("Ingrese los numeros del arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " -- ");
            ar[i] = leer.nextInt();
            if (i > 0) {
                if (ar[i] > ar[i - 1]) {
                    banderapos++;
                } else {
                    if (ar[i] < ar[i - 1]) {
                        banderaneg++;
                    }else{
                        if (ar[i] == ar[i-1]) {
                            igual++;
                        }
                    }
                }
            }
        }
        
        if (banderapos == ar.length-1) {
            System.out.println("Orden creciente");
        } else {
            if (banderaneg == ar.length-1) {
                System.out.println("Orden decreciente");
            }else{
                
                if (igual == ar.length-1) {
                    System.out.println("Todos son iguales");
                }else{
                    System.out.println("Desordenado");
                }
                
            }
        }

        

    }

}
