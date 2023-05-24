
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_6 {
    //6. Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int suma = 0, num;
        
        do{
            
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma = suma + num; 
        }while (num != 0);
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
    
}
