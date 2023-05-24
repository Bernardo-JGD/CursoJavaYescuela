
package Operadores;

import java.util.Scanner;
public class Operaciones {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese 2 numeros");
        float nm1, nm2, suma, resta, multi, div, resi;
        nm1 = leer.nextFloat();
        nm2 = leer.nextFloat();
        
        suma = nm1 + nm2;
        resta = nm1 - nm2;
        multi = nm1 * nm2;
        div = nm1 / nm2;
        resi = nm1 % nm2;
        System.out.println("La suma de los dos numeros es: " + suma);
        System.out.println("La resta de los dos numeros es: " + resta);
        System.out.println("La multiplicacion de los dos numeros es: " + multi);
        System.out.println("La division de los dos numeros es: " + div);
        System.out.println("El residuo de los dos numeros es: " + resi);
        
        
    }
    
}
