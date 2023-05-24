
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_1 {
    
    /*
    1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
    debe indicarlo.
    */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        double a, b, c;//coeficientes
        double x1, x2, d;//soluciones y determinante
        
        System.out.println("Ingrese el coeficiente (a)");
        a = leer.nextDouble ();
        System.out.println("Ingrese el coeficiente (b)");
        b = leer.nextDouble ();
        System.out.println("Ingrese el coeficiente (c)");
        c = leer.nextDouble ();
        
        d = ((b*b)-(4*a*c));
        if (d<0) {
            System.out.println("No tiene solución real, su solución es imaginaria");
        }else{
            if (a == 0) {
                System.out.println("a = 0, el resultado es 0 ");
            }else{
                x1 = ((-b) + (Math.sqrt(d)))/(2*a);
                x2 = ((-b) - (Math.sqrt(d)))/(2*a);
                System.out.println("Solucion x1 = " + x1);
                System.out.println("Solucion x2 = " + x2);
            }
        }
        
    }
    
}
