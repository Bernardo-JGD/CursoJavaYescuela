
package Ejercicios;

import java.util.Scanner;
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Leer un numero y mostrar su cuadrado hasta que se introduzca un numero negativo");
        
        double numero, cuadrado;
        
        do{
            
            System.out.println("Ingrese un numero");
            numero = leer.nextDouble();
            
            cuadrado = Math.pow(numero, 2);
            System.out.println("EL numero " + numero + "elevado al cuadrado es: " + cuadrado);
            
        }while (numero>=0);
        
    }
    
}
