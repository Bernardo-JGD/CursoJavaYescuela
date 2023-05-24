
package Ejercicios;

import java.util.Scanner;
public class Ejercicio131 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        // ------------------------------------ESTE ES DEL VIDEO
        
        System.out.println("Leer 10 numeros enteros en una tabla.");
        System.out.println("Guardar en otra tabla los elementos pares de la primera");
        System.out.println("y a continuacion los elementos impares");
        
        int arreglo[] = new int [10];
        int tam_par = 0, tam_impar = 0;
        
        System.out.println("Ingrese 10 numeros enteros");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = leer.nextInt();
            if (arreglo[i] %2 == 0) {
                tam_par++;
            }else{
                tam_impar++;
            }
        }
        int pares[] = new int [tam_par];
        int impares[] = new int [tam_impar];
        tam_par = 0;
        tam_impar = 0;
        
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] %2 == 0) {
                pares[tam_par] = arreglo[i];
                tam_par++;
            }else{
                impares [tam_impar] = arreglo[i];
                tam_impar++;
            }
        }
        System.out.println("Arreglo original");
        for (int i = 0; i < 10; i++) {
            System.out.print("-" + arreglo[i] + "-");
        }
        System.out.println("");
        System.out.println("Arreglo par");
        for (int i = 0; i < pares.length; i++) {
            System.out.print("-" + pares[i] + "-");
        }
        System.out.println("");
        System.out.println("Arreglo impares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print("-" + impares[i] + "-");
        }
    }
    
}
