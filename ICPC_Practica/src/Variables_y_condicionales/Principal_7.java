
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_7 {
    //7. Pedir dos números y decir cual es el mayor.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int a, b;
        System.out.println("Ingrese un numero a");
        a = leer.nextInt();
        System.out.println("Ingrese un numero b");
        b = leer.nextInt();
        
        if (a>b) {
            System.out.println("a = " + a + " Es mayor que b = " + b);
        }else{
            if (b>a) {
                System.out.println("b = " + b + " Es mayor que a = " + a);
            }else{
                System.out.println("Son iguales");
            }
        }
        
    }
    
}
