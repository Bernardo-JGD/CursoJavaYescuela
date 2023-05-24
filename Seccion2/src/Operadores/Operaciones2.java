
package Operadores;

import java.util.Scanner;
public class Operaciones2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int numero;
        final int constante;
        
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        int incremento = numero;
        int decremento = numero;
        int multiplo = numero;
        int division = numero;
        int residuo = numero;
        
        System.out.println("Ingrese la constante");
        constante = leer.nextInt();
        
        incremento += constante;
        decremento -= constante;
        multiplo *= constante;
        division /= constante;
        residuo %= constante;
        
        System.out.println("El incremento del numero es: " + incremento);
        System.out.println("El decremento del numero es: " + decremento);
        System.out.println("El multiplo del numero es: " + multiplo);
        System.out.println("La division del numero es: " + division);
        System.out.println("El residuo del numero es: " + residuo);
    }
}
