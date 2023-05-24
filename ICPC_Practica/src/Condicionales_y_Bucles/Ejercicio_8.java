
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_8 {
    //8. Pedir un número N, y mostrar todos los números del 1 al N.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int n, contador= 0;
        System.out.println("Ingrese un numero");
        n = leer.nextInt();
        
        while(contador != n){
            contador++;
            System.out.println(contador);
        }
        
    }
    
}
