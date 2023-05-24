
package Operadores.Ejercicios;

import java.util.Scanner;
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo");
        System.out.println("Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa");
        System.out.println("que calcule a imprima la cantidad de dinero que tienen entre los tres");
        
        float Guillermo, Luis, Juan, lostres;
        System.out.println("Ingrese la cantidad de dolares que tien Guillermo");
        Guillermo = leer.nextFloat ();
        
        Luis = Guillermo/2;
        Juan = (Guillermo + Luis)/2;
        
        lostres = Guillermo + Luis + Juan;
        
        System.out.println("La cantidad de dolares de Guillerno es: " + Guillermo);
        System.out.println("La cantidad de dolares de Luis es: " + Luis);
        System.out.println("La cantidad de dolares que tiene Juan es: " + Juan);
        System.out.println("La cantidad de dinero entre los tres es: " + lostres);
    }
    
}
