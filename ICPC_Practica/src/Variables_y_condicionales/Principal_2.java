
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_2 {
    
    /*
    2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
    */
    
    public static void main (String args[]){
        
        Scanner leer = new Scanner (System.in);
        
        double r, area;
        
        System.out.println("Ingrese el radio de un circulo");
        r = leer.nextDouble ();
        
        area = Math.PI * r;
        
        System.out.println("El area del circulo es: " + area);
        
    }
    
}
