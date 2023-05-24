
package Ejercicios;

import java.util.Scanner;
public class Ejercicio81 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Diseñar una aplicacion que declare una tabla de 10 elementos enteros. Leer mediante el teclado");
        System.out.println("8 numeros. Despues se debe de pedir un numero y una posicion, insertarlo en la posicion indicada");
        System.out.println("desplazando los que esten detras");
        
        int ar[] = new int[10];
        int num, pos, aux = 0, aux2 = 0;

        System.out.println("Digite 8 numeros");
        for (int i = 0; i < 8; i++) {
            ar[i] = leer.nextInt();
        }
        System.out.println("Numero");
        num = leer.nextInt();
        System.out.println("Posicion menor que 10");
        pos = leer.nextInt();
        
        //Correr una posicion los elementos detras de la posicicon que el usuario quiere 
        for (int i = 7; i < pos; i++) {
            ar[i+1] = ar[i];
        }
        // insertamos el numero en la posicicon requerida
        ar[pos] = num;
        
        for (int i = 0; i < 9; i++) {
            System.out.print("-" + ar[i] + "-");
        }
        
    }
    
}
