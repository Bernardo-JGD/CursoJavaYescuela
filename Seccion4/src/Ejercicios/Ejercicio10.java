package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Pedir 10 numeros y escribir la suma total");

        int incremento = 0, numero = 0, suma = 0;
        while (incremento < 10) {

            System.out.println("Ingrese un numero entero");
            numero = leer.nextInt();
            suma = suma + numero;
            incremento++;
        }
        System.out.println("La suma total de los numeros que ingreso es:  " + suma);

    }

}
