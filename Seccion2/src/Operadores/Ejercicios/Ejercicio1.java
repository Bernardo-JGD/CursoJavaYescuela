
package Operadores.Ejercicios;

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Imprimir la suma de 3 calificaciones");
        double cal1, cal2, cal3;
        System.out.println("Ingrese la primera calificacion");
        cal1 = leer.nextDouble ();
        System.out.println("Ingrese la segunda calificacion");
        cal2 = leer.nextDouble ();
        System.out.println("Ingrese la tercera calificacion");
        cal3 = leer.nextDouble ();
        double suma = cal1 + cal2 + cal3 ; 
        System.out.println("La suma de " + cal1 + " + " + cal2 + " + " + cal3 + " es: " + suma);
        
    }

    
}
