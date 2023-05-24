
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_5 {
    
    //5. Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
    //números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. 
    //El proceso termina cuando el usuario acierta.
    
    public static void main (String args[]){
        
        Scanner leer = new Scanner (System.in);
        int num1, num2=0;
        System.out.println("Ingrese un numero para ser adivinado");
        num1 = leer.nextInt();
        while (num1 != num2){
            
            System.out.println("Ingresa un numero");
            num2 = leer.nextInt();
            if (num2<num1) {
                System.out.println("El numero que ingresaste es menor");
            }else{
                if (num2>num1) {
                    System.out.println("El numero que ingresaste en mayor");
                }
            }
        }
        System.out.println("Lo lograste :D");
    }
    
}
