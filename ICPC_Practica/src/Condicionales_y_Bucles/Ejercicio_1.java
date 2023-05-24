
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_1 {
    //1. Leer un número y mostrar su cuadrado, repetir el proceso 
    //hasta que se introduzca un número negativo.

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        double numero=0, cuadrado;
        while (numero>=0){
            System.out.println("Ingrese un numero");
            numero = leer.nextDouble ();
            cuadrado = Math.pow(numero, 2);
            System.out.println(cuadrado);
        }
    }
    
}
