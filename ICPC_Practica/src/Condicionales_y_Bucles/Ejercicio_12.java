
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_12 {
    //12. Pedir un número y calcular su factorial.
    //como yo lo entendi 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        long n, factorial = 1;
        System.out.println("Ingrese un numero");
        n = leer.nextLong();
        
        for (int i = (int)n; i>0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial del numero que ingreso es: " + factorial);
        
    }
    
}
