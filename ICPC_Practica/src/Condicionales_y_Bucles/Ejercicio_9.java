
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_9 {
    //9. Escribir todos los números del 100 al 0 de 7 en 7.
    //como yo entendi
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int n = 100;
        while (n>0){
            System.out.println(n);
            n-=7;
        }
        
    }
    
}
