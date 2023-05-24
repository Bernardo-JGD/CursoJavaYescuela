
package Ejercicios;

import java.util.Scanner;
public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Pedir 10 sueldos.");
        System.out.println("Mostrar su suma y cuantos hay mayores de 1000");
        
        int sueldo, incremil=0, sueldosuma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el monto del sueldo");
            sueldo = leer.nextInt();
            sueldosuma = sueldosuma + sueldo;
            if (sueldo>1000) {
                incremil++;
            }
        }
        System.out.println("La suma de todos los sueldos es: " + sueldosuma);
        System.out.println("Cantidad de sueldos mayores a 1000---" + incremil);
        
    }
    
}
