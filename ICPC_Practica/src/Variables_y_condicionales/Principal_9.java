
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_9 {
    //el 8 era el mismo que el 7, solo me pedia que hiciera algo que hice en el 7 
    //9. Pedir dos números y mostrarlos ordenados de mayor a menor.
    public static void main (String args[]){
        
        Scanner leer = new Scanner (System.in);
        int a, b;
        System.out.println("Ingrese un numero a");
        a = leer.nextInt();
        System.out.println("Ingrese un numero b");
        b = leer.nextInt();
        
        if (a>b) {
            System.out.println(a + "," + b);
        }else{
            if (b>a) {
                System.out.println(b + "," + a);
            }else{
                System.out.println("Iguales");
                System.out.println(b + "," + a);
            }
            
        }
        
    }
    
}
