
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_3 {
    //3. Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int num;
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            if (num%2 == 0) {
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
            if (num == 0) {
                System.out.println("Adios :'v ");
            }
            
        }while (num != 0);
    }
    
}
