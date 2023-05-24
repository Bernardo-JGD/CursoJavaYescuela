
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_2 {
    //2. Leer un número e indicar si es positivo o negativo. 
    //El proceso se repetirá hasta que se introduzca un 0.

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner (System.in);
        
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            if (num>0) {
                System.out.println("Positivo");
            }else{
                if (num<0) {
                    System.out.println("Negativo");
                }else{
                    if (num == 0) {
                        System.out.println("Cero, adios :'v ");
                    }
                }
            }
            
        }while (num != 0);
        
    }
    
}
