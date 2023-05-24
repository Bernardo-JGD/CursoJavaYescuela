
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_10 {
    //10. Pedir 15 números y escribir la suma total.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int suma=0, n;
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese un numero");
            n = leer.nextInt();
            suma = suma + n;
        }
        System.out.println("La suma de los 15 numeros es: " + suma);
        
    }
    
}
