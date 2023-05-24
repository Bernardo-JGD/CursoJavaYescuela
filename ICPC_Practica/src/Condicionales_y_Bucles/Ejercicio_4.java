
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_4 {
    //4. Pedir números hasta que se teclee uno negativo, 
    //y mostrar cuántos números se han introducido.
    //aqui cuento todos los numeros e incluso el negativo

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int num;
        int contador = 0;
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            contador++;
        }while (num>=0);
        System.out.println("Total de numeros ingresados: " + contador);
        
    }
    
}
