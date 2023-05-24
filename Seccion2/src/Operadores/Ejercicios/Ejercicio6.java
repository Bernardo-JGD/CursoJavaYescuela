
package Operadores.Ejercicios;

import java.util.Scanner;
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Hacer un programa que calcule el cuadrado de una suma: ");
        System.out.println("(a+b)^2 = a^2 + 2ab + b^2");
        
        double a, b;
        System.out.println("Ingrese el valor de a");
        a = leer.nextDouble ();
        System.out.println("Ingrese el valor de b");
        b = leer.nextDouble ();
        double acuadrada, bcuadrada, ab2, resultado;
        acuadrada = Math.pow(a, 2);
        bcuadrada = Math.pow(b, 2);
        ab2 = 2* (a*b);
        resultado = acuadrada + ab2 + bcuadrada; 
        System.out.println("El resultado es: " + resultado);
        
    }
    
}
