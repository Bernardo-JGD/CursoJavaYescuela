
package Operadores.Ejercicios;

import java.util.Scanner;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Hacer un programa que calcule e imprima el salario semanal");
        System.out.println("de un empleado a partir de sus horas semanales trabajadas y");
        System.out.println("de su salario por hora");
        
        double sph;
        System.out.println("Ingrese el salario por hora");
        sph = leer.nextDouble ();
        double hs;
        System.out.println("Ingrese las horas trabajadas en la semana");
        hs = leer.nextDouble ();
        double salario = sph*hs;
        System.out.println("El salario recibido por trabajar " + hs + " horas en la semana");
        System.out.println("sabiendo que el precio por hora es " + sph + " es: " + salario +"$");
        
    }
    
}
