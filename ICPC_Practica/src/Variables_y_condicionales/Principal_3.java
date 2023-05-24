
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_3 {
    //3. Pedir el radio de una circunferencia y calcular su longitud.
    public static void main (String args[]){
        
        Scanner leer = new Scanner (System.in);
        double r, circun;
        System.out.println("Ingrese el radio");
        r = leer.nextDouble ();
        
        circun = Math.PI * (r*2);
        System.out.println("La longitud de la circunferencia es: " + circun);
        
    }
    
}
