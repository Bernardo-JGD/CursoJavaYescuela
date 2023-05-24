
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_6 {
    
    public static void main (String args[]){
        
        Scanner leer = new Scanner (System.in);
        int n1, n2;
        System.out.println("Ingrese un numero entero a");
        n1 = leer.nextInt();
        System.out.println("Ingrese un numero entero b");
        n2 = leer.nextInt();
        if (n1%n2 == 0) {
            System.out.println("a es multiplo de b ");
        }else{
            System.out.println("a no es multiplo de b");
        }
        
    }
    
}
