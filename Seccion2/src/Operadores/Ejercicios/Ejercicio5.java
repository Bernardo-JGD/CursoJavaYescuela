
package Operadores.Ejercicios;

import java.util.Scanner;
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("La calificiacion final de un estudiante de informatica se calcula con base a las calificaciones");
        System.out.println("de 4 aspectos de su rendimiento academico: participacion, primer examen parcial, segundo examen parcial");
        System.out.println("y examen final. Sabiendo que las calificaciones anteriores entran a la calificacion final con");
        System.out.println("ponderaciones del 10%, 25%, 25% y 40%. Hacer un programa que calcule e imprima la calificacion final");
        System.out.println("Obtenida por un estudiante");
        
        double participacion, pep, sep, ef, por1, por2, por3, por4, calificacionfinal;
        System.out.println("Ingrese la calificacion de la participcion");
        participacion = leer.nextDouble ();
        por1 = participacion*0.1;
        System.out.println("Ingrese la calificacion del examen del primer parcial");
        pep = leer.nextDouble ();
        por2 = pep*0.25;
        System.out.println("Ingrese la califcicacion del segundo examen parcial");
        sep = leer.nextDouble ();
        por3 = sep*0.25;
        System.out.println("Ingrese la calificacion del examen final");
        ef = leer.nextDouble ();
        por4 = ef*0.40;
        calificacionfinal = por1 +por2 + por3 + por4;
        System.out.println("La calificacion final es : " + calificacionfinal);
        
    }
    
}
