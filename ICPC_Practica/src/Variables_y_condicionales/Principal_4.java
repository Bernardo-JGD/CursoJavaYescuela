
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_4 {
    //4. Pedir dos números enteros y decir si son iguales o no.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int a, b;
        System.out.println("Ingrese el numero entero a");
        a = leer.nextInt();
        System.out.println("Ingrese el numero entero b");
        b = leer.nextInt();
        if (a == b) {
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("Los numeros no son iguales");
        }
        
        
    }
    
}
