
package Operadores.Ejercicios;

import java.util.Scanner;
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Contruir un programa que, dado un numero total de horas");
        System.out.println("Devuelva el numero de semanas, dias y horas equivalentes. ");
        System.out.println("Por ejemplo: dado un total de 1000 horas, debe mostrar: 5 semanas, 6 dias y 16 horas" );
        
        int horas_total;
        int semanas, dias, horas;
        System.out.println("Ingrese el numero de horas");
        horas_total = leer.nextInt ();
        semanas = (int) horas_total/168;
        dias = (horas_total%168)/24;
        horas = horas_total%24;
        System.out.println("semanas: " + semanas );
        System.out.println("Dias:  " + dias );
        System.out.println("Horas: " + horas);
    }
    
}
