
package Excepciones_162_Concepto;

import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        //Dividir entre 0
        /*
        int num1 = 5, num2 = 0;
        int resultado = num1 / num2;
        System.out.println("Resultado: " + resultado);
        System.out.println("Hola mundo");
        */
        
        //Ingresar una cadena en vez de un numero
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
    }
    
}
