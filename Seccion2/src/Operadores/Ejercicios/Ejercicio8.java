
package Operadores.Ejercicios;

import java.util.Scanner;
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Construir un programa que calcule y muestre por pantalla las raices de la ecuacion");
        System.out.println("de segundo grado de coeficientes reales:  a*x^2 + b*x + c = 0");
        
        double a, b, c, resultadomas, resultadomenos;
        System.out.print("Ingrese a");
        a = leer.nextDouble ();
        System.out.print("ingrese b");
        b = leer.nextDouble ();
        System.out.print("Ingrese c");
        c = leer.nextDouble ();
        
        resultadomas = ( -b + Math.sqrt(Math.pow(b, 2) - (4*a*c) ) )/(2*a);
        resultadomenos = ( -b - Math.sqrt(Math.pow(b, 2) - (4*a*c) ) )/(2*a);
        System.out.println("Resultado + " + resultadomas);
        System.out.println("Resultado - " + resultadomenos);
        
    }
    
}
