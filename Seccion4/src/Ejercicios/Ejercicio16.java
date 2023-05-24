
package Ejercicios;

import java.util.Scanner;
public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Pide un numero (que debe de estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero");
        
        int numero_tabla, multi;
        
        System.out.println("Ingrese el numer para mostrar su tabla");
        numero_tabla = leer.nextInt();
        
        for (int i = 1; i <=10; i++) {
            
            multi = numero_tabla * i;
            
            System.out.println(numero_tabla + " x " + "" + " = " + multi);
        }
        
    }
    
}
