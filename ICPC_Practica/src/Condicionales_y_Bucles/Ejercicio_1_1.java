
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_1_1 {
    //1. Leer un número y mostrar su cuadrado, repetir el proceso 
    //hasta que se introduzca un número negativo.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int num, cuadrado;
        //num guardara en numero que leamos
        // y cuadrado guardara el cuadrado de num
        
        System.out.println("Introduzca numero: " );
        num = leer.nextInt();
        while (num>=0){//repetimos el proceso hasta que el numero leido no sea negativo 
            
            cuadrado = num*num;
            System.out.println(num+ "² es igual a "+ cuadrado);
            System.out.println("Introduzca otro numero: ");
            num = leer.nextInt();//volvemos a leer num
            
        }
    }
    
}
