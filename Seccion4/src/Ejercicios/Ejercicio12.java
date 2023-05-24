package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Pedir un numero y calcular su factorial");

        int numero = 0, factorial, decremento;
        System.out.println("Ingrese un numero entero");
        numero = leer.nextInt();
        factorial = numero;
        decremento = numero;
        while (decremento > 0) {

            
            
            decremento--;
            if (decremento>0) {
                factorial = factorial * decremento;
            }
            
        }
        System.out.println("Factorial de  " + numero + " es " + factorial);
    }

}
