
package Herencia_130;

import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        Estudiante e = new Estudiante ("Bernardo", "Guzman Diaz", 20, 18212, 9.281f);
        
        e.mostrarDatos();
        
    }
    
}
