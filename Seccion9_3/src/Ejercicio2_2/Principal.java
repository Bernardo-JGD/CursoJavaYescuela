
package Ejercicio2_2;

import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        Tablero t;
        int sino, x, y;
        
        do{
            System.out.println("Ingrese la posicion en x");
            x = leer.nextInt();
            System.out.println("Ingrese la posicion en y");
            y = leer.nextInt();
            t = new Tablero (x, y);
            System.out.println("La posicion actual es: " + "(" + t.getX() + ", " + t.getY() + ")");
            
            System.out.println("¿Desea regresar al menu principal?");
            System.out.println("1.Si    2.No");
            sino = leer.nextInt();
        }while (sino != 2);
        
    }
    
}
