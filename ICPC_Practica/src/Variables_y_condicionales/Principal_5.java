
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_5 {
    //5. Pedir un número e indicar si es positivo o negativo.
    public static void main (String args[]){
        
        Scanner leer = new Scanner (System.in);
        
        int numero;
        System.out.println("Ingrese un numero entero");
        numero = leer.nextInt();
        if (numero<0) {
            System.out.println("El numero que ingreso es negativo");
        }else{
            if (numero>0) {
                System.out.println("El numero que ingreso es positivo");
            }else{
                System.out.println("El numero que ingreso es 0");
            }
        }
        
    }
    
}
