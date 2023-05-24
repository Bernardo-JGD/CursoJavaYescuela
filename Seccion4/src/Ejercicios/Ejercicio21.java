
package Ejercicios;

import java.util.Scanner;
public class Ejercicio21 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Pedir 10 numeros y mostrar al final si se ha introducido alguno negativo");
        
        System.out.println("Ingrese 10 numeros");
        int num=0, nega_aux=0;
        boolean haymalos = false;
        
        for (int i = 1; i <=10; i++) {
            num = leer.nextInt();
            if (num<0) {
                haymalos = true;
            }else{
                haymalos = false;
            }
            if (haymalos) {
                nega_aux++;
            }
            System.out.println(haymalos);
            
        }
        
        System.out.println("Cantidad de numeros negativos --- " + nega_aux);
        
    }
    
}
